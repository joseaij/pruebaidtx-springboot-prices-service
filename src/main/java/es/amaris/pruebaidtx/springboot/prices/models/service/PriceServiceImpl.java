package es.amaris.pruebaidtx.springboot.prices.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.amaris.pruebaidtx.springboot.prices.models.entity.Price;
import es.amaris.pruebaidtx.springboot.prices.models.repository.PriceRepository;

@Service
public class PriceServiceImpl implements IPriceService {
		
	private final PriceRepository priceRepository;	
	
	@Autowired
    public PriceServiceImpl(PriceRepository repository) {
        this.priceRepository = repository;        
    }		
	
	@Override
	@Transactional(readOnly = true)
	public List<Price> findByProductIdAndBrandId(final Long productId, final Integer brandId) {					
		
		Optional<List<Price>> optionalPrice = Optional.ofNullable(priceRepository.findByProductIdAndBrandId(productId, brandId));				
		
		return optionalPrice.orElse(null);
	}
	
}
