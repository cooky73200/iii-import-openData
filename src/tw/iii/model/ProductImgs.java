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
@Table(name = "ProductImg")
public class ProductImgs implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ProductImgs() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProductImgID")
	private Integer productImgId;
	@Column(name="ProductImg")
	private String productImg;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ProductID")
	private Product product;

	public Integer getProductImgId() {
		return productImgId;
	}

	public void setProductImgId(Integer productImgId) {
		this.productImgId = productImgId;
	}

	public String getProductImg() {
		return productImg;
	}

	public void setProductImg(String productImg) {
		this.productImg = productImg;
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
		builder.append("ProductImgs [productImgId=");
		builder.append(productImgId);
		builder.append(", productImg=");
		builder.append(productImg);
		builder.append(", product=");
		builder.append(product);
		builder.append("]");
		return builder.toString();
	}

	
	
}
