package es.amaris.pruebaidtx.springboot.prices.models.service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.amaris.pruebaidtx.springboot.prices.conversor.PriceConversor;
import es.amaris.pruebaidtx.springboot.prices.models.entity.Price;
import es.amaris.pruebaidtx.springboot.prices.models.repository.PriceRepository;
import es.amaris.pruebaidtx.springboot.prices.vo.PriceVo;

@Service
public class PriceServiceImpl implements IPriceService {
		
	private final PriceRepository priceRepository;
	private final PriceConversor priceConversor;
	
	@Autowired
    public PriceServiceImpl(PriceRepository repository, PriceConversor conversor) {
        this.priceRepository = repository;
        this.priceConversor = conversor;
    }		
	
	@Override
	@Transactional(readOnly = true)
	public PriceVo findByCustomQuery(final LocalDateTime priceDate, final Long productId, final Integer brandId) {
		Optional<Price> optionalPrice = Optional.of(filterByPriority(priceRepository.findByCustomQuery(priceDate, productId, brandId)));					
		return priceConversor.convert(optionalPrice.orElse(null));
	}

	/**
	 * filterByPriority
	 * 
	 * @param List<Price> prices
	 * @return Price
	 */
	private Price filterByPriority(List<Price> prices) {		
		Comparator<Price> comparator = Comparator.comparing(Price::getPriority);
		return prices.stream().max(comparator).get();
	}
	
}
