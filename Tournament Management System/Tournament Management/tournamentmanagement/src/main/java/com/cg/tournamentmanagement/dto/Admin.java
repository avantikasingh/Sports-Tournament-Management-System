package com.cg.tournamentmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "admin_Id")
	private Long adminId;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String passwaord;

	
	public Admin() {
		// TODO Auto-generated constructor stub
	}


	public Admin(Long adminId, String username, String passwaord) {
		super();
		this.adminId = adminId;
		this.username = username;
		this.passwaord = passwaord;
	}


	public Long getAdminId() {
		return adminId;
	}


	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPasswaord() {
		return passwaord;
	}


	public void setPasswaord(String passwaord) {
		this.passwaord = passwaord;
	}


	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", username=" + username + ", passwaord=" + passwaord + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminId == null) ? 0 : adminId.hashCode());
		result = prime * result + ((passwaord == null) ? 0 : passwaord.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Admin other = (Admin) obj;
		if (adminId == null) {
			if (other.adminId != null)
				return false;
		} else if (!adminId.equals(other.adminId))
			return false;
		if (passwaord == null) {
			if (other.passwaord != null)
				return false;
		} else if (!passwaord.equals(other.passwaord))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
}
