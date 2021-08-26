package com.example.demo;

public class Contact {

	private String id;
	private String name;
	private String Phone;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", Phone=" + Phone + "]";
	}
	
}
