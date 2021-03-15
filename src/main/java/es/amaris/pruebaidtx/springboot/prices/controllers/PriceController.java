package es.amaris.pruebaidtx.springboot.prices.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import es.amaris.pruebaidtx.springboot.prices.models.entity.Price;
import es.amaris.pruebaidtx.springboot.prices.models.service.IPriceService;

@RestController
@RequestMapping("/prices")
public class PriceController {
	
	@Autowired
	private IPriceService priceService;	
	
	@GetMapping("")
	@ResponseBody	
	public List<Price> findByCustomQuery(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate, 
			                    @RequestParam Long productId, 
			                    @RequestParam Integer brandId){							
		
		return priceService.findByCustomQuery(startDate, productId, brandId);	
	}
		
}
