package es.amaris.pruebaidtx.springboot.prices.filter;

import java.time.LocalDateTime;
import java.util.List;

import es.amaris.pruebaidtx.springboot.prices.models.entity.Price;
import es.amaris.pruebaidtx.springboot.prices.vo.PriceVo;

public interface IPriceFilter {

	PriceVo applyPriceFilter(final List<Price> priceList, final LocalDateTime priceDate);
	
}
