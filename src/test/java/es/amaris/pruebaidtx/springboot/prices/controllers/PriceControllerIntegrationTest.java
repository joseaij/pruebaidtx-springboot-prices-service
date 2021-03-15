package es.amaris.pruebaidtx.springboot.prices.controllers;

import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import es.amaris.pruebaidtx.springboot.prices.models.service.PriceServiceImpl;

@WebMvcTest
public class PriceControllerIntegrationTest {
	
	@Autowired
    private MockMvc mockMvc;

    @MockBean
    private PriceServiceImpl priceService;

    @Test
    void test1() throws Exception {
    	
    	LocalDateTime localDateTime = LocalDateTime.parse("2020-06-14T10:00:00");    	        
        
        mockMvc.perform(get("/prices?startDate=2020-06-14T10:00:00&productId=35455&brandId=1"))
                .andDo(print())
                .andExpect(status().isOk());
        verify(priceService).findByCustomQuery(localDateTime, Long.parseLong("35455"), 1);
    }
    
    @Test
    void test2() throws Exception {
    	
    	LocalDateTime localDateTime = LocalDateTime.parse("2020-06-14T16:00:00");    	        
        
        mockMvc.perform(get("/prices?startDate=2020-06-14T16:00:00&productId=35455&brandId=1"))
                .andDo(print())
                .andExpect(status().isOk());
        verify(priceService).findByCustomQuery(localDateTime, Long.parseLong("35455"), 1);
    }
    
    @Test
    void test3() throws Exception {
    	
    	LocalDateTime localDateTime = LocalDateTime.parse("2020-06-14T21:00:00");    	        
        
        mockMvc.perform(get("/prices?startDate=2020-06-14T21:00:00&productId=35455&brandId=1"))
                .andDo(print())
                .andExpect(status().isOk());
        verify(priceService).findByCustomQuery(localDateTime, Long.parseLong("35455"), 1);
    }
    
    @Test
    void test4() throws Exception {
    	
    	LocalDateTime localDateTime = LocalDateTime.parse("2020-06-15T10:00:00");    	        
        
        mockMvc.perform(get("/prices?startDate=2020-06-15T10:00:00&productId=35455&brandId=1"))
                .andDo(print())
                .andExpect(status().isOk());
        verify(priceService).findByCustomQuery(localDateTime, Long.parseLong("35455"), 1);
    }    
  
    @Test
    void test5() throws Exception {
    	
    	LocalDateTime localDateTime = LocalDateTime.parse("2020-06-16T21:00:00");    	        
        
        mockMvc.perform(get("/prices?startDate=2020-06-16T21:00:00&productId=35455&brandId=1"))
                .andDo(print())
                .andExpect(status().isOk());
        verify(priceService).findByCustomQuery(localDateTime, Long.parseLong("35455"), 1);
    }

}
