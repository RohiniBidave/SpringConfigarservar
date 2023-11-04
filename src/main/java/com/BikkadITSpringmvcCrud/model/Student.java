package com.BikkadITSpringmvcCrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;

	private String fname;

	private String lname;

	private String saddress;

	private int smarks;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public int getSmarks() {
		return smarks;
	}

	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}

	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", saddress=" + saddress + ", smarks=" + smarks + "]";
	}
}