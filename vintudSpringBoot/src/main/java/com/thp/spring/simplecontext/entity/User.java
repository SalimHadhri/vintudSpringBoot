package com.thp.spring.simplecontext.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "`user`")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUser;

	private String username;
	private String pseudo;
	private String mail;
	private String password;
	private String phone;
	private String address;

	@JsonProperty("roles")
	private String roles = "";
	
	private String permissions = "";

	@OneToMany(fetch = FetchType.EAGER,mappedBy = "user", cascade = CascadeType.ALL,targetEntity=Announcement.class)
	private List<Announcement> annoncements;
	
	
	
	public List<String> getRoleList() {
		if (this.roles.length() > 0) {
			return Arrays.asList(this.roles.split(","));
		}
		return new ArrayList<>();
	}

	public List<String> getPermissionList() {
		if (this.permissions.length() > 0) {
			return Arrays.asList(this.permissions.split(","));
		}
		return new ArrayList<>();
	}
	private int active;

	@OneToMany(mappedBy = "userRecherche")
	private Collection<Recherche> recherches;



	@OneToMany(mappedBy = "userFavori")
	private Collection<Favoris> favorisUser;


	public User() {
	}



	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
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

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Recherche> getRecherches() {
		return recherches;
	}

	public void setRecherches(Collection<Recherche> recherches) {
		this.recherches = recherches;
	}



	public Collection<Favoris> getFavorisUser() {
		return favorisUser;
	}

	public void setFavorisUser(Collection<Favoris> favorisUser) {
		this.favorisUser = favorisUser;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}



	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}


	@JsonIgnore
	public List<Announcement> getAnnoncements() {
		return annoncements;
	}



	public void setAnnoncements(List<Announcement> annoncements) {
		this.annoncements = annoncements;
	}



	public User(Long idUser, String username, String pseudo, String mail, String password, String phone, String address,
			String roles, String permissions, int active, Collection<Recherche> recherches,
			List<Announcement> annoncements, Collection<Favoris> favorisUser) {
		this.idUser = idUser;
		this.username = username;
		this.pseudo = pseudo;
		this.mail = mail;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.roles = roles;
		this.permissions = permissions;
		this.active = active;
		this.recherches = recherches;
		this.annoncements = annoncements;
		this.favorisUser = favorisUser;
	}



	public User(String username, String pseudo, String mail, String password, String phone, String address,
			String roles, String permissions, int active, Collection<Recherche> recherches,
			List<Announcement> annoncements, Collection<Favoris> favorisUser) {
		this.username = username;
		this.pseudo = pseudo;
		this.mail = mail;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.roles = roles;
		this.permissions = permissions;
		this.active = active;
		this.recherches = recherches;
		this.annoncements = annoncements;
		this.favorisUser = favorisUser;
	}



	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", username=" + username + ", pseudo=" + pseudo + ", mail=" + mail
				+ ", password=" + password + ", phone=" + phone + ", address=" + address + ", roles=" + roles
				+ ", permissions=" + permissions + ", active=" + active + ", recherches=" + recherches
				+ ", annoncements=" + annoncements + ", favorisUser=" + favorisUser + "]";
	}





	
	

}