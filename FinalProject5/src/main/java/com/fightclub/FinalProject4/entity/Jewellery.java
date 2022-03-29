package com.fightclub.FinalProject4.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jewellery {
	
	@Id
	private int jId;
	
	private String jName;
	private double jPrice;
	
	public Jewellery() {
		// TODO Auto-generated constructor stub
	}

	public Jewellery(int jId, String jName, double jPrice) {
		super();
		this.jId = jId;
		this.jName = jName;
		this.jPrice = jPrice;
	}

	@Override
	public String toString() {
		return "Jewellery [jId=" + jId + ", jName=" + jName + ", jPrice=" + jPrice + "]";
	}

	public int getjId() {
		return jId;
	}

	public void setjId(int jId) {
		this.jId = jId;
	}

	public String getjName() {
		return jName;
	}

	public void setjName(String jName) {
		this.jName = jName;
	}

	public double getjPrice() {
		return jPrice;
	}

	public void setjPrice(double jPrice) {
		this.jPrice = jPrice;
	}
	
	
}
