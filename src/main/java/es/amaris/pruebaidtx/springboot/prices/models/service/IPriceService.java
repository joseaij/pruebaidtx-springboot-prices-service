package es.amaris.pruebaidtx.springboot.prices.models.service;

import java.util.List;

import es.amaris.pruebaidtx.springboot.prices.models.entity.Price;

public interface IPriceService {
		
	List<Price> findByProductIdAndBrandId(final Long productId, final Integer brandId);
	
}
