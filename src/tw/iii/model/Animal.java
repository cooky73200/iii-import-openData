package tw.iii.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name ="PPet")
public class Animal implements Serializable {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	public Animal() {
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PPetID")
	@JsonIgnore
	private Integer animal_id;
	@Column(name="Subid")
	private String animal_subid ;
	@Column(name="AreaPkid")
	private Integer animal_area_pkid;
	@Column(name="ShelterPkid")
	private Integer animal_shelter_pkid;
	@Column(name="Place")
	private String animal_place;
	@Column(name="AnimalKind")
	private String animal_kind;
	@Column(name="Sex")
	private String animal_sex;
	@Column(name="Bodytype")
	private String animal_bodytype;
	@Column(name="Colour")
	private String animal_colour;
	@Column(name="Age")
	private String animal_age;
	@Column(name="Sterilization")
	private String animal_sterilization;
	@Column(name="Bacterin")
	private String animal_bacterin;
	@Column(name="Foundplace")
	private String animal_foundplace;
	@Column(name="Title")
	private String animal_title;
	@Column(name="animalStatus")
	private String animal_status;
	@Column(name="Remark")
	private String animal_remark;
	@Column(name="Caption")
	private String animal_caption;
	@Column(name="Opendate")
	private String animal_opendate;
	@Column(name="Closeddate")
	private String animal_closeddate;
	@Column(name="AUpdate")
	private String animal_update;
	@Column(name="Createtime")
	private String animal_createtime;
	@Column(name="ShelterName")
	private String shelter_name;
	@Column(name="AlbumFile")
	private String album_file;
	@Column(name="AlbumUpdate")
	private String album_update;
	@Column(name="CDate")
	private String cDate;
	@Column(name="ShelterAddress")
	private String shelter_address;
	@Column(name="ShelterTel")
	private String shelter_tel;



	public Integer getAnimal_id() {
		return animal_id;
	}
	public void setAnimal_id(Integer animal_id) {
		this.animal_id = animal_id;
	}
	public String getAnimal_subid() {
		return animal_subid;
	}
	public void setAnimal_subid(String animal_subid) {
		this.animal_subid = animal_subid;
	}
	public Integer getAnimal_area_pkid() {
		return animal_area_pkid;
	}
	public void setAnimal_area_pkid(Integer animal_area_pkid) {
		this.animal_area_pkid = animal_area_pkid;
	}
	public Integer getAnimal_shelter_pkid() {
		return animal_shelter_pkid;
	}
	public void setAnimal_shelter_pkid(Integer animal_shelter_pkid) {
		this.animal_shelter_pkid = animal_shelter_pkid;
	}
	public String getAnimal_place() {
		return animal_place;
	}
	public void setAnimal_place(String animal_place) {
		this.animal_place = animal_place;
	}
	public String getAnimal_kind() {
		return animal_kind;
	}
	public void setAnimal_kind(String animal_kind) {
		this.animal_kind = animal_kind;
	}
	public String getAnimal_sex() {
		return animal_sex;
	}
	public void setAnimal_sex(String animal_sex) {
		this.animal_sex = animal_sex;
	}
	public String getAnimal_bodytype() {
		return animal_bodytype;
	}
	public void setAnimal_bodytype(String animal_bodytype) {
		this.animal_bodytype = animal_bodytype;
	}
	public String getAnimal_colour() {
		return animal_colour;
	}
	public void setAnimal_colour(String animal_colour) {
		this.animal_colour = animal_colour;
	}
	public String getAnimal_age() {
		return animal_age;
	}
	public void setAnimal_age(String animal_age) {
		this.animal_age = animal_age;
	}
	public String getAnimal_sterilization() {
		return animal_sterilization;
	}
	public void setAnimal_sterilization(String animal_sterilization) {
		this.animal_sterilization = animal_sterilization;
	}
	public String getAnimal_bacterin() {
		return animal_bacterin;
	}
	public void setAnimal_bacterin(String animal_bacterin) {
		this.animal_bacterin = animal_bacterin;
	}
	public String getAnimal_foundplace() {
		return animal_foundplace;
	}
	public void setAnimal_foundplace(String animal_foundplace) {
		this.animal_foundplace = animal_foundplace;
	}
	public String getAnimal_title() {
		return animal_title;
	}
	public void setAnimal_title(String animal_title) {
		this.animal_title = animal_title;
	}
	public String getAnimal_status() {
		return animal_status;
	}
	public void setAnimal_status(String animal_status) {
		this.animal_status = animal_status;
	}
	public String getAnimal_remark() {
		return animal_remark;
	}
	public void setAnimal_remark(String animal_remark) {
		this.animal_remark = animal_remark;
	}
	public String getAnimal_caption() {
		return animal_caption;
	}
	public void setAnimal_caption(String animal_caption) {
		this.animal_caption = animal_caption;
	}
	public String getAnimal_opendate() {
		return animal_opendate;
	}
	public void setAnimal_opendate(String animal_opendate) {
		this.animal_opendate = animal_opendate;
	}
	public String getAnimal_closeddate() {
		return animal_closeddate;
	}
	public void setAnimal_closeddate(String animal_closeddate) {
		this.animal_closeddate = animal_closeddate;
	}
	public String getAnimal_update() {
		return animal_update;
	}
	public void setAnimal_update(String animal_update) {
		this.animal_update = animal_update;
	}
	public String getAnimal_createtime() {
		return animal_createtime;
	}
	public void setAnimal_createtime(String animal_createtime) {
		this.animal_createtime = animal_createtime;
	}
	public String getShelter_name() {
		return shelter_name;
	}
	public void setShelter_name(String shelter_name) {
		this.shelter_name = shelter_name;
	}
	public String getAlbum_file() {
		return album_file;
	}
	public void setAlbum_file(String album_file) {
		this.album_file = album_file;
	}
	public String getAlbum_update() {
		return album_update;
	}
	public void setAlbum_update(String album_update) {
		this.album_update = album_update;
	}
	public String getcDate() {
		return cDate;
	}
	public void setcDate(String cDate) {
		this.cDate = cDate;
	}
	public String getShelter_address() {
		return shelter_address;
	}
	public void setShelter_address(String shelter_address) {
		this.shelter_address = shelter_address;
	}
	public String getShelter_tel() {
		return shelter_tel;
	}
	public void setShelter_tel(String shelter_tel) {
		this.shelter_tel = shelter_tel;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [animal_id=");
		builder.append(animal_id);
		builder.append(", animal_subid=");
		builder.append(animal_subid);
		builder.append(", animal_area_pkid=");
		builder.append(animal_area_pkid);
		builder.append(", animal_shelter_pkid=");
		builder.append(animal_shelter_pkid);
		builder.append(", animal_place=");
		builder.append(animal_place);
		builder.append(", animal_kind=");
		builder.append(animal_kind);
		builder.append(", animal_sex=");
		builder.append(animal_sex);
		builder.append(", animal_bodytype=");
		builder.append(animal_bodytype);
		builder.append(", animal_colour=");
		builder.append(animal_colour);
		builder.append(", animal_age=");
		builder.append(animal_age);
		builder.append(", animal_sterilization=");
		builder.append(animal_sterilization);
		builder.append(", animal_bacterin=");
		builder.append(animal_bacterin);
		builder.append(", animal_foundplace=");
		builder.append(animal_foundplace);
		builder.append(", animal_title=");
		builder.append(animal_title);
		builder.append(", animal_status=");
		builder.append(animal_status);
		builder.append(", animal_remark=");
		builder.append(animal_remark);
		builder.append(", animal_caption=");
		builder.append(animal_caption);
		builder.append(", animal_opendate=");
		builder.append(animal_opendate);
		builder.append(", animal_closeddate=");
		builder.append(animal_closeddate);
		builder.append(", animal_update=");
		builder.append(animal_update);
		builder.append(", animal_createtime=");
		builder.append(animal_createtime);
		builder.append(", shelter_name=");
		builder.append(shelter_name);
		builder.append(", album_file=");
		builder.append(album_file);
		builder.append(", album_update=");
		builder.append(album_update);
		builder.append(", cDate=");
		builder.append(cDate);
		builder.append(", shelter_address=");
		builder.append(shelter_address);
		builder.append(", shelter_tel=");
		builder.append(shelter_tel);
		builder.append("]");
		return builder.toString();
	}

	

		
}
