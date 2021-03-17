package es.amaris.pruebaidtx.springboot.prices.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import es.amaris.pruebaidtx.springboot.prices.filter.PriceFilterImpl;
import es.amaris.pruebaidtx.springboot.prices.models.service.PriceServiceImpl;

@WebMvcTest
public class PriceControllerIntegrationTest {
	
	@Autowired
    private MockMvc mockMvc;

    @MockBean
    private PriceServiceImpl priceService;
    
    @MockBean
    private PriceFilterImpl priceFilter;

    @Test
    void test1() throws Exception {    	    		       
        
        mockMvc.perform(get("/prices/2020-06-14T10:00:00/35455/1"))
                .andDo(print())
                .andExpect(status().isOk());        
    }
    
    @Test
    void test2() throws Exception {    	    	  	       
        
        mockMvc.perform(get("/prices/2020-06-14T16:00:00/35455/1"))
                .andDo(print())
                .andExpect(status().isOk());
    }
    
    @Test
    void test3() throws Exception {    	    	       
        
        mockMvc.perform(get("/prices/2020-06-14T21:00:00/35455/1"))
                .andDo(print())
                .andExpect(status().isOk());
    }
    
    @Test
    void test4() throws Exception {    	    	  	       
        
        mockMvc.perform(get("/prices/2020-06-15T10:00:00/35455/1"))
                .andDo(print())
                .andExpect(status().isOk());
    }    
  
    @Test
    void test5() throws Exception {    	    		       
        
        mockMvc.perform(get("/prices/2020-06-16T21:00:00/35455/1"))
                .andDo(print())
                .andExpect(status().isOk());
    }

}