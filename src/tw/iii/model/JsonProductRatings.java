package tw.iii.model;

import java.util.Map;

public class JsonProductRatings {
		
	private String[] star;
	private Map<String,String>[] ratingDetail;
	public String[] getStar() {
		return star;
	}
	public void setStar(String[] star) {
		this.star = star;
	}
	public Map<String, String>[] getRatingDetail() {
		return ratingDetail;
	}
	public void setRatingDetail(Map<String, String>[] ratingDetail) {
		this.ratingDetail = ratingDetail;
	}
	
	

}
