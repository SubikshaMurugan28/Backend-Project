package com.tnsif.Student_ServiceSubiksha;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
	@Id
	@Column(name="Cid")
	private int id;
	@Column(name="Cname")
	private String name;
	@Column(name="Caddress")
	private int address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
