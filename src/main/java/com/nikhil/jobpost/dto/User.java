package com.nikhil.jobpost.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.nikhil.jobpost.entity.UserEntity;

public class User {

	@NotNull(message="User Id is a required field")
	private Integer userId;
	
	@NotNull(message="Name is a required field")
	@Size(min=1, max=40, message="Name has to be at least 1 and utmost 40 characters long")
	private String name;
	
	@NotNull(message="Email is a required field")
	@Size(min=1, max=40, message="Email has to be at least 1 and utmost 40 characters long")
	private String email;
	
	@NotNull(message="Password is a required field")
	@Size(min=1, max=20, message="Password has to be at least 1 and utmost 20 characters long")
	private String password;
	
	@NotNull(message="Phone is a required field")
	@Size(min=1, max=10, message="Phone has to be at least 1 and utmost 10 characters long")
	private String phone;
	
	@NotNull(message="Address is a required field")
	@Size(min=1, max=50, message="Address has to be at least 1 and utmost 50 characters long")
	private String address;
	
	public User() {
		
	}

	public User(Integer userId, String name, String email, String password, String phone, String address) {
		
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password + ", phone="
				+ phone + ", address=" + address + "]";
	}

	public User createUserFromEntity(UserEntity userEntity) {
		
		this.userId = userEntity.getUserId();
		this.name = userEntity.getName();
		this.email = userEntity.getEmail();
		this.password = userEntity.getPassword();
		this.address = userEntity.getAddress();
		this.phone = userEntity.getPhone();
		return this;
	}
	
}
