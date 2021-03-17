package es.amaris.pruebaidtx.springboot.prices.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import es.amaris.pruebaidtx.springboot.prices.filter.IPriceFilter;
import es.amaris.pruebaidtx.springboot.prices.models.service.IPriceService;
import es.amaris.pruebaidtx.springboot.prices.vo.PriceVo;

@RestController
@RequestMapping("/prices")
public class PriceController {
		
	private final IPriceService priceService;
	private final IPriceFilter priceFilter;
	
	@Autowired
    public PriceController(IPriceService priceService, IPriceFilter priceFilter) {
        this.priceService = priceService;
        this.priceFilter = priceFilter;
    }		
	
	
	@GetMapping("/{priceDate}/{productId}/{brandId}")
	@ResponseBody
	public PriceVo findPriceToApply(
			@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime priceDate, 
			@PathVariable Long productId, 
			@PathVariable Integer brandId){
										
		return priceFilter.applyPriceFilter(priceService.findByProductIdAndBrandId(productId, brandId), priceDate);
	}					
	
}
