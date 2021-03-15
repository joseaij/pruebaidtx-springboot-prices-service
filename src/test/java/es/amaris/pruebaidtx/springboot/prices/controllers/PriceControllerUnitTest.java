package es.amaris.pruebaidtx.springboot.prices.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.amaris.pruebaidtx.springboot.prices.models.entity.Price;


@SpringBootTest
class PriceControllerUnitTest {
	
	@Autowired
	PriceController priceController;
			
	@Test
	public void test1() throws Exception {	
				
		//GIVEN		
		LocalDateTime localDateTime = LocalDateTime.parse("2020-06-14T10:00:00");
		
        //WHEN
        List<Price> prices = priceController.findByCustomQuery(localDateTime, Long.parseLong("35455"), 1);

        //THEN
        assertThat(prices.size()).isEqualTo(0);       						        
	}
	
	@Test
	public void test2() throws Exception {	
				
		//GIVEN		
		LocalDateTime localDateTime = LocalDateTime.parse("2020-06-14T16:00:00");
		
        //WHEN
        List<Price> prices = priceController.findByCustomQuery(localDateTime, Long.parseLong("35455"), 1);

        //THEN
        assertThat(prices.size()).isEqualTo(0);       						        
	}
	
	@Test
	public void test3() throws Exception {	
				
		//GIVEN		
		LocalDateTime localDateTime = LocalDateTime.parse("2020-06-14T21:00:00");
		
        //WHEN
        List<Price> prices = priceController.findByCustomQuery(localDateTime, Long.parseLong("35455"), 1);

        //THEN
        assertThat(prices.size()).isEqualTo(0);       						        
	}
	
	@Test
	public void test4() throws Exception {	
				
		//GIVEN		
		LocalDateTime localDateTime = LocalDateTime.parse("2020-06-15T10:00:00");
		
        //WHEN
        List<Price> prices = priceController.findByCustomQuery(localDateTime, Long.parseLong("35455"), 1);

        //THEN
        assertThat(prices.size()).isEqualTo(0);       						        
	}
	
	@Test
	public void test5() throws Exception {	
				
		//GIVEN		
		LocalDateTime localDateTime = LocalDateTime.parse("2020-06-16T21:00:00");
		
        //WHEN
        List<Price> prices = priceController.findByCustomQuery(localDateTime, Long.parseLong("35455"), 1);

        //THEN
        assertThat(prices.size()).isEqualTo(0);       						        
	}
	
}
