package com.nagarro.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "availability")
public class Availability {

	@Id
	int id;
	@Column(name="pincodes")
	int pincodes;
	@Column(name="pid")
	int pid;
	@Column(name="days")
	int days;

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPincodes() {
		return pincodes;
	}

	public void setPincodes(int pincodes) {
		this.pincodes = pincodes;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

}
