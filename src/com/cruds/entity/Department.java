package com.cruds.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

	@Id  //is used for primary key
	private int deptid;
	
	@Column // its a column in db
	private String deptname;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Department(int deptid, String deptname) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
	}
	
	public int getDeptid() {
		return deptid;
	}
	
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + "]";
	}
	
	
}
