package com.capgemini.obs.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.validator.constraints.Length;



@Entity
@Table(name="CustomerInfo")
public class CustomerInfo {
	@Id
	
	@Column(name="customer_Id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq")
    @SequenceGenerator(sequenceName = "customer_sequence", allocationSize = 100, name = "customer_seq")
	private Long customerId;
	
	
	@NotEmpty(message = "name is mandatory")
	@Column(name="FullName")
	@Length(min=8, max=30)
	private String FullName;
	
	@NotEmpty(message = "Email is mandatory")
	@Column(name="Email")
	@Length(min=10, max=64)
	private String Email ;
	
	@NotEmpty(message = "password is mandatory")
	@Column(name="password")
	@Length(min=8, max=30)
	private String password;
	
	@NotEmpty(message = "PhoneNumber is mandatory")
	@Column(name="PhoneNumber")
	@Length(min=10, max=15)
	private Long PhoneNumber;
	
	@NotEmpty(message = "city name is mandatory")
	@Column(name="city")
	@Length(min=3, max=32)
	private String city;
	
	@NotEmpty(message = "Address is mandatory")
	@Column(name="Address")
	@Length(min=10, max=128)
	private String Address;
	
	@NotEmpty(message = "ZipCode is mandatory")
	@Column(name="ZipCode")
	@Length(min=3, max=24)
	private String ZipCode;
	
	@NotEmpty(message = "Country name is mandatory")
	@Column(name="Country")
	@Length(min=3, max=64)
	private String Country;

	@OneToMany(fetch=FetchType.EAGER,targetEntity = OrderInfo.class, cascade = CascadeType.ALL)
	@Fetch(value = FetchMode.SUBSELECT)
	@JoinColumn(name = "customer_Id", referencedColumnName = "customer_Id")
	private List<OrderInfo> OrderInfo;
	
	@OneToMany(fetch=FetchType.EAGER,targetEntity = BookInfo.class, cascade = CascadeType.ALL)
	@Fetch(value = FetchMode.SUBSELECT)
	@JoinColumn(name = "customer_Id", referencedColumnName = "customer_Id")
	private List<BookInfo> BookInfo;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public List<OrderInfo> getOrderInfo() {
		return OrderInfo;
	}

	public void setOrderInfo(List<OrderInfo> orderInfo) {
		OrderInfo = orderInfo;
	}

	public List<BookInfo> getBookInfo() {
		return BookInfo;
	}

	public void setBookInfo(List<BookInfo> bookInfo) {
		BookInfo = bookInfo;
	}

	@Override
	public String toString() {
		return "CustomerInfo [customerId=" + customerId + ", FullName=" + FullName + ", Email=" + Email + ", password="
				+ password + ", PhoneNumber=" + PhoneNumber + ", city=" + city + ", Address=" + Address + ", ZipCode="
				+ ZipCode + ", Country=" + Country + ", OrderInfo=" + OrderInfo + ", BookInfo=" + BookInfo + "]";
	}

	public CustomerInfo(Long customerId,
			@NotEmpty(message = "name is mandatory") @Length(min = 8, max = 30) String fullName,
			@NotEmpty(message = "Email is mandatory") @Length(min = 10, max = 64) String email,
			@NotEmpty(message = "password is mandatory") @Length(min = 8, max = 30) String password,
			@NotEmpty(message = "PhoneNumber is mandatory") @Length(min = 10, max = 15) Long phoneNumber,
			@NotEmpty(message = "city name is mandatory") @Length(min = 3, max = 32) String city,
			@NotEmpty(message = "Address is mandatory") @Length(min = 10, max = 128) String address,
			@NotEmpty(message = "ZipCode is mandatory") @Length(min = 3, max = 24) String zipCode,
			@NotEmpty(message = "Country name is mandatory") @Length(min = 3, max = 64) String country,
			List<com.capgemini.obs.Entity.OrderInfo> orderInfo, List<com.capgemini.obs.Entity.BookInfo> bookInfo) {
		super();
		this.customerId = customerId;
		FullName = fullName;
		Email = email;
		this.password = password;
		PhoneNumber = phoneNumber;
		this.city = city;
		Address = address;
		ZipCode = zipCode;
		Country = country;
		OrderInfo = orderInfo;
		BookInfo = bookInfo;
	}

	public CustomerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}