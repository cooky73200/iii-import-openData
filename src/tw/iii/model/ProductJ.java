package tw.iii.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

public class ProductJ implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ProductJ() {
		
	}

	private Integer productId;
	@JsonIgnore
	private Long itemId; 

	private Long shopId;

	private String name;

	private String sort;

	private String brand;

	private Integer stock;

	private float disCount;

	private String shopLocation;

	private Integer likedCount;

	private Integer viewCount;

	private String currency;


	private Float priceMin;

	private Float priceMax;

	private Float price;

	private Integer cmtCount;

	private String[] images;

	private Float itemRating;

	private String description;

	private String[] options;
	

	private Map<String,String>[] attributes;
	public Integer getProductId() {
		return productId;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}


	public Long getItemId() {
		return itemId;
	}


	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}


	public Long getShopId() {
		return shopId;
	}


	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSort() {
		return sort;
	}


	public void setSort(String sort) {
		this.sort = sort;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}


	public float getDisCount() {
		return disCount;
	}


	public void setDisCount(float disCount) {
		this.disCount = disCount;
	}


	public String getShopLocation() {
		return shopLocation;
	}


	public void setShopLocation(String shopLocation) {
		this.shopLocation = shopLocation;
	}


	public Integer getLikedCount() {
		return likedCount;
	}


	public void setLikedCount(Integer likedCount) {
		this.likedCount = likedCount;
	}


	public Integer getViewCount() {
		return viewCount;
	}


	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public Float getPriceMin() {
		return priceMin;
	}


	public void setPriceMin(Float priceMin) {
		this.priceMin = priceMin;
	}


	public Float getPriceMax() {
		return priceMax;
	}


	public void setPriceMax(Float priceMax) {
		this.priceMax = priceMax;
	}


	public Float getPrice() {
		return price;
	}


	public void setPrice(Float price) {
		this.price = price;
	}


	public Integer getCmtCount() {
		return cmtCount;
	}


	public void setCmtCount(Integer cmtCount) {
		this.cmtCount = cmtCount;
	}


	public String[] getImages() {
		return images;
	}


	public void setImages(String[] images) {
		this.images = images;
	}


	public Float getItemRating() {
		return itemRating;
	}


	public void setItemRating(Float itemRating) {
		this.itemRating = itemRating;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String[] getOptions() {
		return options;
	}


	public void setOptions(String[] options) {
		this.options = options;
	}


	public Map<String, String>[] getAttributes() {
		return attributes;
	}


	public void setAttributes(Map<String, String>[] attributes) {
		this.attributes = attributes;
	}

	
	
	
	
	
	
}
