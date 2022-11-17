package org.tahsan.web.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="customers")
public class customers implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String FirstName;
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	private String MiddleName;
	private String LastName;
	private String Address1;
	private String Address2;
	private String state;
	private String City;
	private String zip;
	private Date dob;
	private String phone;
	private String email;


	public customers(){}

	public customers(String FirstName, String MiddleName, String LastName, String Address1, String Address2, String City,
			String state, String zip, String phone, String email) {
		super();
		this.FirstName = FirstName;
		this.MiddleName = MiddleName;
		this.LastName = LastName;
		this.Address1 = Address1;
		this.Address2 = Address2;
		this.state = state;
		this.City = City;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstname(String FirstName) {
		this.FirstName = FirstName;
	}
	public String getMiddleName() {
		return 
				MiddleName;
	}
	public void setMiddlename(String MiddleName) {
		this.MiddleName = MiddleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastname(String LastName) {
		this.LastName = LastName;
	}
	
	public String getAddress1() {
		return Address1;
	}
	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}

	public String getAddress2() {
		return Address1;
	}
	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}

	public String getCity() {
		return City;
	}
	public void setCity(String City) {
		this.City = City;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString()

	{
		return "User [id=" + id + ", firstname=" + FirstName + ", middlename=" + MiddleName + ", lastname=" + LastName
				+ ", address1=" + Address1 + ", address2=" + Address2 + ", city=" + City + ", state=" + state
				+ ", zip=" + zip +  "Phone=" + phone + ", email=" + email + "]";
	}

}
