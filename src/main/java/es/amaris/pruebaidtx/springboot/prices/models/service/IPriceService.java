package es.amaris.pruebaidtx.springboot.prices.models.service;

import java.time.LocalDateTime;

import es.amaris.pruebaidtx.springboot.prices.vo.PriceVo;

public interface IPriceService {
		
	PriceVo findByCustomQuery(final LocalDateTime priceDate, final Long productId, final Integer brandId);
	
}
