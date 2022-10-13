package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class myaadhar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fullname;
	private String dob;
	private String address;
	private String email;
	private int phone;
	private String gender;

//	private String imageUrl;

//	public String getImageUrl() {
//		return imageUrl;
//	}

//	public void setImageUrl(String imageUrl) {
//		this.imageUrl = imageUrl;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "myaadhar [id=" + id + ", fullname=" + fullname + ", dob=" + dob + ", address=" + address + ", email="
				+ email + ", phone=" + phone + ", gender=" + gender + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	@Override
//	public String toString() {
//		return "myaadhar [id=" + id + ", fullname=" + fullname + ", gender=" + gender + ", address=" + address
//				+ ", dob=" + dob + ", phone=" + phone + ", email=" + email + ", imageUrl=" + imageUrl + "]";
//	}

}
