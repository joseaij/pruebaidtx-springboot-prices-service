package es.amaris.pruebaidtx.springboot.prices.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.amaris.pruebaidtx.springboot.prices.models.entity.Price;


public interface PriceRepository extends JpaRepository<Price, Long>{		
	
	@Query("SELECT p FROM Price p WHERE productId = ?1 AND brandId = ?2")
	List<Price> findByProductIdAndBrandId(final Long productId, final Integer brandId);
	
}
