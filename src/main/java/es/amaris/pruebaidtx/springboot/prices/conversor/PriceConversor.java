package es.amaris.pruebaidtx.springboot.prices.conversor;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import es.amaris.pruebaidtx.springboot.prices.models.entity.Price;
import es.amaris.pruebaidtx.springboot.prices.vo.PriceVo;

@Component
public class PriceConversor implements Converter<Price, PriceVo> {

	@Override
	public PriceVo convert(Price source) {
		return source == null ? null : new PriceVo.Builder()
                .withPriceId(source.getPriceId())
                .withProductId(source.getProductId())
                .withBrandId(source.getBrandId())
                .withStartDate(source.getStartDate())
                .withEndDate(source.getEndDate())
                .withPriceList(source.getPriceList())
                .withPrice(source.getPrice())
                .build();
	}

}
