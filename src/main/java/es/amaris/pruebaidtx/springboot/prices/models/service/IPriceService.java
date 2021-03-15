package es.amaris.pruebaidtx.springboot.prices.models.service;

import java.time.LocalDateTime;
import java.util.List;

import es.amaris.pruebaidtx.springboot.prices.models.entity.Price;

public interface IPriceService {
		
	public List<Price> findByCustomQuery(LocalDateTime startDate, Long productId, Integer brandId);
	
}
