package tw.iii.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="ProductOptions")
public class ProductOptions implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ProductOptions() {
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OptionsID")
	private Integer optionsId;
	@Column(name="POption")
	private String pOption;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ProductID")
	private Product product;
	public Integer getOptionsId() {
		return optionsId;
	}
	public void setOptionsId(Integer optionsId) {
		this.optionsId = optionsId;
	}
	public String getpOption() {
		return pOption;
	}
	public void setpOption(String pOption) {
		this.pOption = pOption;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductOptions [optionsId=");
		builder.append(optionsId);
		builder.append(", pOption=");
		builder.append(pOption);
		builder.append(", product=");
		builder.append(product);
		builder.append("]");
		return builder.toString();
	}
	
	

}
