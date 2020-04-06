package com.smart.delivery.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;

	@Column(name="plot_no")
	private String plotNo;

	@Column(name="street_name")
	private String streetName;

	@Column(name="mobile_no")
	private long MobileNo;

	@OneToOne(mappedBy = "address" )
	private Farmer farmer;
	
	
	
	public Address() {

	}
	

	public Address(String plotNo, String streetName, long mobileNo) {
		this.plotNo = plotNo;
		this.streetName = streetName;
		MobileNo = mobileNo;
	}


	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public long getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}


	@Override
	public String toString() {
		return "Address [Id=" + Id + ", plotNo=" + plotNo + ", streetName=" + streetName + ", MobileNo=" + MobileNo
				+ "]";
	}
	
	

}
