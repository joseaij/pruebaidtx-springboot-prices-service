package es.amaris.pruebaidtx.springboot.prices.filter;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.amaris.pruebaidtx.springboot.prices.converter.PriceConverter;
import es.amaris.pruebaidtx.springboot.prices.models.entity.Price;
import es.amaris.pruebaidtx.springboot.prices.vo.PriceVo;

@Component
public class PriceFilterImpl implements IPriceFilter{
	
	private final PriceConverter priceConverter;	
	
	@Autowired
    public PriceFilterImpl(PriceConverter converter) {
        this.priceConverter = converter;        
    }		

	@Override
	public PriceVo applyPriceFilter(final List<Price> priceList, final LocalDateTime priceDate) {		
		
		//Sort the list by startDate
		priceList.sort(Comparator.comparing(Price::getStartDate));						
		
		//if (priceList.get(0).getStartDate().isBefore(priceDate)) {																						
		
		return priceConverter.convert(filterPriceByDateRangeAndHighPriority(priceList, priceDate).get());			 
	}		

	
	
	/**
	 * filterPriceByDateRangeAndHighPriority
	 * 
	 * @param final List<Price> priceList
	 * @param final LocalDateTime priceDate
	 * @return Optional<Price>
	 */	
	private Optional<Price> filterPriceByDateRangeAndHighPriority(final List<Price> priceList, final LocalDateTime priceDate) {				
						
		return Optional.ofNullable(priceList.stream()
				.filter(s -> !s.getStartDate().isAfter(priceDate))
				.filter(s -> s.getEndDate().isAfter(priceDate))
				.max(Comparator.comparing(Price::getPriority)).orElse(null));
	}
				
}
