package tw.iii.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
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

@Entity
@Table(name="Product")
public class Product implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Product() {
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ProductID")
	private Integer productId;
	@Transient
	@JsonIgnore
	private Long itemId; 
	@Column(name="Shopid")
	private Long shopId;
	@Column(name="Name")
	private String name;
	@Column(name="Sort")
	private String sort;
	@Column(name="Brand")
	private String brand;
	@Column(name="Stock")
	private Integer stock;
	@Column(name="Discount")
	private String discount;
	@Column(name="ShopLocation")
	private String shopLocation;
	@Column(name="LikedCount")
	private Integer likedCount;
	@Column(name="ViewCount")
	private Integer viewCount;
	@Column(name="Currency")
	private String currency;
	
	@Column(name="historicalSold")
	private Float historicalSold;

	@Column(name="PriceMin")
	private Float priceMin;
	@Column(name="PriceMax")
	private Float priceMax;
	@Column(name="Price")
	private Float price;
	@Column(name="CmtCount")
	private Integer cmtCount;
	@Transient
	private String[] images;
	@Column(name="ItemRating")
	private Float itemRating;
	@Column(name="Description")
	private String description;
	@Transient
	private String[] options;
	
	@Transient
	private Att[] attributes;


	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "product",cascade = CascadeType.ALL)
	private Set<ProductImgs> tableImgs = new LinkedHashSet<>();
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "product",cascade = CascadeType.ALL)
	private Set<ProductOptions> tableOptions = new LinkedHashSet<>();
	
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "product",cascade = CascadeType.ALL)
	private Set<ProductAttributes> tableAttributes = new LinkedHashSet<>();
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


	public String getDiscount() {
		return discount;
	}


	public void setDiscount(String discount) {
		this.discount = discount;
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


	public Float getHistoricalSold() {
		return historicalSold;
	}


	public void setHistoricalSold(Float historicalSold) {
		this.historicalSold = historicalSold;
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


	public Att[] getAttributes() {
		return attributes;
	}


	public void setAttributes(Att[] attributes) {
		this.attributes = attributes;
	}


	public Set<ProductImgs> getTableImgs() {
		return tableImgs;
	}


	public void setTableImgs(Set<ProductImgs> tableImgs) {
		this.tableImgs = tableImgs;
	}


	public Set<ProductOptions> getTableOptions() {
		return tableOptions;
	}


	public void setTableOptions(Set<ProductOptions> tableOptions) {
		this.tableOptions = tableOptions;
	}


	public Set<ProductAttributes> getTableAttributes() {
		return tableAttributes;
	}


	public void setTableAttributes(Set<ProductAttributes> tableAttributes) {
		this.tableAttributes = tableAttributes;
	}
	
	
	
	
	
	
	
}
