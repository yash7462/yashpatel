package com.PlantMaster.main.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "tbl_plantmaster")
@EntityListeners(AuditingEntityListener.class)
public class PlantMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long plantmasterId;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "gender", nullable = false)
	private String gender;

	@Column(name = "dob", nullable = false)
	private Date dateofbirth;

	@Column(name = "primarymobileno", nullable = false)
	private long primarymobileno;

	@Column(name = "secondarymobileno", nullable = false)
	private long secondarymobileno;

	@Column(name = "experience", nullable = false)
	private String experience;

	@Column(name = "house_no", nullable = false)
	private String houseNo;

	@Column(name = "street_name", nullable = false)
	private String streetName;

	@Column(name = "area", nullable = false)
	private String area;

	@Column(name = "landmark", nullable = false)
	private String landmark;

	@Column(name = "city", nullable = false)
	private String city;

	@Column(name = "pincode", nullable = false)
	private int pincode;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false)
	private Date createdAt;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", nullable = false)
	private Date updatedAt;

	public PlantMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlantMaster(long plantmasterId, String firstName, String lastName, String email, String gender,
			Date dateofbirth, long primarymobileno, long secondarymobileno, String experience, String houseNo,
			String streetName, String area, String landmark, String city, int pincode, Date createdAt, Date updatedAt) {
		super();
		this.plantmasterId = plantmasterId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.dateofbirth = dateofbirth;
		this.primarymobileno = primarymobileno;
		this.secondarymobileno = secondarymobileno;
		this.experience = experience;
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.area = area;
		this.landmark = landmark;
		this.city = city;
		this.pincode = pincode;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public long getPlantmasterId() {
		return plantmasterId;
	}

	public void setPlantmasterId(long plantmasterId) {
		this.plantmasterId = plantmasterId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public long getPrimarymobileno() {
		return primarymobileno;
	}

	public void setPrimarymobileno(long primarymobileno) {
		this.primarymobileno = primarymobileno;
	}

	public long getSecondarymobileno() {
		return secondarymobileno;
	}

	public void setSecondarymobileno(long secondarymobileno) {
		this.secondarymobileno = secondarymobileno;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "PlantMaster [plantmasterId=" + plantmasterId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", gender=" + gender + ", dateofbirth=" + dateofbirth + ", primarymobileno="
				+ primarymobileno + ", secondarymobileno=" + secondarymobileno + ", experience=" + experience
				+ ", houseNo=" + houseNo + ", streetName=" + streetName + ", area=" + area + ", landmark=" + landmark
				+ ", city=" + city + ", pincode=" + pincode + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ "]";
	}

}
