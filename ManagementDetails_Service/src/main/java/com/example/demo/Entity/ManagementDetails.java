package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="management")
public class ManagementDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="managementid")
	private Integer managementid;
	
	@Column(name="managementname")
	private String managementname;
	
	@Column(name="managementdesignation")
	private String managementdesignation;
	
	@Column(name="managementdepartment")
	private String managementdepartment;

	public Integer getManagementid() {
		return managementid;
	}

	public void setManagementid(Integer managementid) {
		this.managementid = managementid;
	}

	public String getManagementname() {
		return managementname;
	}

	public void setManagementname(String managementname) {
		this.managementname = managementname;
	}

	public String getManagementdesignation() {
		return managementdesignation;
	}

	public void setManagementdesignation(String managementdesignation) {
		this.managementdesignation = managementdesignation;
	}

	public String getManagementdepartment() {
		return managementdepartment;
	}

	public void setManagementdepartment(String managementdepartment) {
		this.managementdepartment = managementdepartment;
	}

	public ManagementDetails(Integer managementid, String managementname, String managementdesignation,
			String managementdepartment) {
		super();
		this.managementid = managementid;
		this.managementname = managementname;
		this.managementdesignation = managementdesignation;
		this.managementdepartment = managementdepartment;
	}

	public ManagementDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ManagementDetails [managementid=" + managementid + ", managementname=" + managementname
				+ ", managementdesignation=" + managementdesignation + ", managementdepartment=" + managementdepartment
				+ "]";
	}
	
	
	
}
