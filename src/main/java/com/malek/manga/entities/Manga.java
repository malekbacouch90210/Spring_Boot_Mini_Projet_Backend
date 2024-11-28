package com.malek.manga.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Manga {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idManga;
	private String nomManga;
	private Double prixManga;
	private String Mangaka;
	private Date dateCreation;
	private String email;
	private String password;
	
	
	@ManyToOne
	private Demographie demographie;
	
	public Manga() {
		super();
	}
	public Manga(String nomManga, Double prixManga, Date dateCreation,String Mangaka,String email,String password) {
		super();
		this.nomManga = nomManga;
		this.prixManga = prixManga;
		this.dateCreation = dateCreation;
		this.Mangaka=Mangaka;
		this.email=email;
		this.password=password;
		
	}
	
	public Long getIdManga() {
		return idManga;
	}
	public void setIdManga(Long idManga) {
		this.idManga = idManga;
	}
	public String getNomManga() {
		return nomManga;
	}
	public void setNomManga(String nomManga) {
		this.nomManga = nomManga;
	}
	public Double getPrixManga() {
		return prixManga;
	}
	public void setPrixManga(Double prixManga) {
		this.prixManga = prixManga;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public String getMangaka() {
		return Mangaka;
	}
	public void setMangaka(String mangaka) {
		Mangaka = mangaka;
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
	
	@Override
	public String toString() {
		return "Manga [idManga=" + idManga + ", nomManga=" + nomManga + ", prixManga=" + prixManga + ", Mangaka="
				+ Mangaka + ", dateCreation=" + dateCreation + ", email=" + email + ", password=" + password + "]";
	}
	public Demographie getDemographie() {
		return demographie;
	}
	public void setDemographie(Demographie demographie) {
		this.demographie = demographie;
	}
	
	
	

}
