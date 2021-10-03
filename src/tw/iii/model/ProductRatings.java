package tw.iii.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "productratings")
public class ProductRatings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "star")
	private String star;
	@Column(name = "username")
	private String userName;
	@Column(name = "comment")
	private String comment;
	@Column(name = "mtime")
	private Date mTime;
	@Getter(AccessLevel.NONE)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ProductID")
	private Product product;
	
	

	public ProductRatings() {
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getStar() {
		return star;
	}



	public void setStar(String star) {
		this.star = star;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public Date getmTime() {
		return mTime;
	}



	public void setmTime(Date mTime) {
		this.mTime = mTime;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}
	



	
	

}
