package es.amaris.pruebaidtx.springboot.prices.models.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.amaris.pruebaidtx.springboot.prices.models.entity.Price;


public interface PriceRepository extends JpaRepository<Price, Long>{
	
	@Query("SELECT p FROM Price p WHERE ?1 between startDate and endDate AND productId = ?2 AND brandId = ?3")
	List<Price> findByCustomQuery(final LocalDateTime priceDate, final Long productId, final Integer brandId);
	
}
