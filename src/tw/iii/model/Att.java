package tw.iii.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
public class Att {
	
	private String name;
	
	private String value;
	@JsonIgnore
	private int id;
	@JsonIgnore
	private String is_timestamp;
	@JsonIgnore
	private String brand_option;
	@JsonIgnore
	private String val_id;
	

	

}
