package es.amaris.pruebaidtx.springboot.prices.vo;

import java.time.LocalDateTime;


public class PriceVo {
		
	private Long priceId;			
	private Long productId;				
	private Integer brandId;		
	private LocalDateTime startDate;		
	private LocalDateTime endDate;			
	private Integer priceList;					
	private Double price;
	
	
	
	
	
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandId == null) ? 0 : brandId.hashCode());
		result = prime * result + ((priceId == null) ? 0 : priceId.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PriceVo other = (PriceVo) obj;
		if (brandId == null) {
			if (other.brandId != null)
				return false;
		} else if (!brandId.equals(other.brandId))
			return false;
		if (priceId == null) {
			if (other.priceId != null)
				return false;
		} else if (!priceId.equals(other.priceId))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		return true;
	}										
	
	
	public static class Builder {

        private final PriceVo object;

        public Builder() {
            object = new PriceVo();
        }

        public Builder withPriceId(Long value) {
            object.priceId = value;
            return this;
        }

        public Builder withProductId(Long value) {
            object.productId = value;
            return this;
        }

        public Builder withBrandId(Integer value) {
            object.brandId = value;
            return this;
        }

        public Builder withStartDate(LocalDateTime value) {
            object.startDate = value;
            return this;
        }

        public Builder withEndDate(LocalDateTime value) {
            object.endDate = value;
            return this;
        }
        
        public Builder withPriceList(Integer value) {
            object.priceList = value;
            return this;
        }
        
        public Builder withPrice(Double value) {
            object.price = value;
            return this;
        }

        public PriceVo build() {
            return object;
        }
    }

}
