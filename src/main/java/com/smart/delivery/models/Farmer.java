package com.smart.delivery.models;

import javax.persistence.*;

@Entity
@Table(name="suppliers")
public class Farmer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="address", joinColumns=@JoinColumn(name="Id"))
	private Address address;
	
	
	public Farmer() {
		
	}
	
	public Farmer(String firstName, String lastName, long mobileNo, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Farmer [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName +  ", address=" + address + "]";
	}
	
	
	
}
