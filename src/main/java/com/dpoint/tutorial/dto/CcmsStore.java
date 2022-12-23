package com.dpoint.tutorial.dto;

import javax.persistence.*;

@Entity
@Table(name = "CCMS_DATA")
public class CcmsStore {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(name = "Name")
	private String Name;

	@Column(name = "Phone")
	private String Phone;

	@Column(name = "Court_Id")
	private String CourtId;
	
	@Column(name = "Customer")
	private String Customer;
	
	@Column(name = "Comment")
	private String Comment;

	public CcmsStore() {

	}

	public CcmsStore(long id, String name, String phone, String courtId, String customer, String comment) {
		super();
		this.id = id;
		Name = name;
		Phone = phone;
		CourtId = courtId;
		Customer = customer;
		Comment = comment;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getCourtId() {
		return CourtId;
	}

	public void setCourtId(String courtId) {
		CourtId = courtId;
	}

	public String getCustomer() {
		return Customer;
	}

	public void setCustomer(String customer) {
		Customer = customer;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	@Override
	public String toString() {
		return "CcmsStore [id=" + id + ", Name=" + Name + ", Phone=" + Phone + ", CourtId=" + CourtId + ", Customer="
				+ Customer + ", Comment=" + Comment + "]";
	}

	

}