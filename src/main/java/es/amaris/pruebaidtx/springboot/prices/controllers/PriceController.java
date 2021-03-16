package es.amaris.pruebaidtx.springboot.prices.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import es.amaris.pruebaidtx.springboot.prices.models.service.IPriceService;
import es.amaris.pruebaidtx.springboot.prices.vo.PriceVo;

@RestController
@RequestMapping("/prices")
public class PriceController {
		
	private final IPriceService priceService;	
	
	@Autowired
    public PriceController(IPriceService priceService) {
        this.priceService = priceService;
    }
	
	@GetMapping("")
	@ResponseBody	
	public PriceVo findByCustomQuery(
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime priceDate, 
			@RequestParam Long productId, 
			@RequestParam Integer brandId){							
		
		return priceService.findByCustomQuery(priceDate, productId, brandId);	
	}
		
}
