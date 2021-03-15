package es.amaris.pruebaidtx.springboot.prices.models.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRICES")
public class Price implements Serializable{
		
	private static final long serialVersionUID = 5059269808634451308L;
	
	@Id	
	@Column(name = "PRICE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long priceId;
		
	@Column(name = "PRODUCT_ID")	
	private Long productId;
			
	@Column(name = "BRAND_ID")	
	private Integer brandId;
	
	@Column(name = "START_DATE")
	private LocalDateTime startDate;
	
	@Column(name = "END_DATE")
	private LocalDateTime endDate;
		
	@Column(name = "PRICE_LIST")
	private Integer priceList;		
		
	@Column(name = "PRIORITY")
	private Integer priority;	
	
	@Column(name = "PRICE")
	private Double price;		
	
	@Column(name = "CURR")
	private String curr;

	
	
	
	
	public Long getPriceId() {
		return priceId;
	}

	public void setPriceId(Long priceId) {
		this.priceId = priceId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Integer getPriceList() {
		return priceList;
	}

	public void setPriceList(Integer priceList) {
		this.priceList = priceList;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}				
																		
}
