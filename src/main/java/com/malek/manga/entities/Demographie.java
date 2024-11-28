package com.malek.manga.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Demographie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCat;
	private String nomCat;
	private String descriptionCat;
	
	@JsonIgnore
	@OneToMany (mappedBy = "demographie")
	private List<Manga> mangas;
	
	public Long getIdCat() {
		return idCat;
	}
	public void setIdCat(Long idCat) {
		this.idCat = idCat;
	}
	public String getNomCat() {
		return nomCat;
	}
	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}
	public String getDescriptionCat() {
		return descriptionCat;
	}
	public void setDescriptionCat(String descriptionCat) {
		this.descriptionCat = descriptionCat;
	}
	public List<Manga> getMangas() {
		return mangas;
	}
	public void setMangas(List<Manga> mangas) {
		this.mangas = mangas;
	}
	
	
	

}
