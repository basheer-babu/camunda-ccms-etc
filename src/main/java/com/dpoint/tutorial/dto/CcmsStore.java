package com.dpoint.tutorial.dto;

import javax.persistence.*;

@Entity
@Table(name = "CCMS_DATA")
public class CcmsStore {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	private String CaseRefrenceNo;
	private String CourtName;
	private String CourtId;
	private String Customer;
	private String RequestType;
	private String CourtOrderDate;
	private String ProInstanceId;
	private String level;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCaseRefrenceNo() {
		return CaseRefrenceNo;
	}
	public void setCaseRefrenceNo(String caseRefrenceNo) {
		CaseRefrenceNo = caseRefrenceNo;
	}
	public String getCourtName() {
		return CourtName;
	}
	public void setCourtName(String courtName) {
		CourtName = courtName;
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
	public String getRequestType() {
		return RequestType;
	}
	public void setRequestType(String requestType) {
		RequestType = requestType;
	}
	public String getCourtOrderDate() {
		return CourtOrderDate;
	}
	public void setCourtOrderDate(String courtOrderDate) {
		CourtOrderDate = courtOrderDate;
	}
	public String getProInstanceId() {
		return ProInstanceId;
	}
	public void setProInstanceId(String proInstanceId) {
		ProInstanceId = proInstanceId;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "CcmsStore [id=" + id + ", CaseRefrenceNo=" + CaseRefrenceNo + ", CourtName=" + CourtName + ", CourtId="
				+ CourtId + ", Customer=" + Customer + ", RequestType=" + RequestType + ", CourtOrderDate="
				+ CourtOrderDate + ", ProInstanceId=" + ProInstanceId + ", level=" + level + "]";
	}
	
	
	
	
	
	
	

}