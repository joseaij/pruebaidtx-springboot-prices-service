package es.amaris.pruebaidtx.springboot.prices.models.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.amaris.pruebaidtx.springboot.prices.models.entity.Price;
import es.amaris.pruebaidtx.springboot.prices.models.repository.PriceRepository;

@Service
public class PriceServiceImpl implements IPriceService {
	
	@Autowired
	private PriceRepository priceRepository;	
	
	@Override
	@Transactional(readOnly = true)
	public List<Price> findByCustomQuery(LocalDateTime startDate, Long productId, Integer brandId) {
		return priceRepository.findByCustomQuery(startDate, productId, brandId);
	}

}
