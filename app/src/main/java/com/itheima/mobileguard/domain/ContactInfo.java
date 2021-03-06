package com.itheima.mobileguard.domain;

public class ContactInfo {
	
	private String id;
	private String phone;
	private String qq;
	private String email;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ContactInfo [id=" + id + ", phone=" + phone + ", qq=" + qq
				+ ", email=" + email + ", name=" + name + "]";
	}
	
}
