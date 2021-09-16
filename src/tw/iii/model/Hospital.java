package tw.iii.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hospital")
public class Hospital implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HospitalID")
	private Integer hospitalId;
	@Column(name = "HospitalName")
	private String HospitalName;
	@Column(name = "Address")
	private String Address;
	@Column(name = "Area")
	private String Area;
	@Column(name = "Tel")
	private String Tel;
	public Integer getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalName() {
		return HospitalName;
	}
	public void setHospitalName(String hospitalName) {
		HospitalName = hospitalName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hospital [hospitalId=");
		builder.append(hospitalId);
		builder.append(", HospitalName=");
		builder.append(HospitalName);
		builder.append(", Address=");
		builder.append(Address);
		builder.append(", Area=");
		builder.append(Area);
		builder.append(", Tel=");
		builder.append(Tel);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	

}
