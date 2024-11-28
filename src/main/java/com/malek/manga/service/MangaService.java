package com.malek.manga.service;

import java.util.List;

import com.malek.manga.entities.Demographie;
import com.malek.manga.entities.Manga;

public interface MangaService {
	Manga saveManga(Manga m);
	Manga updateManga(Manga m);
	void deleteManga(Manga m);
	void deleteMangaById(Long id);
	Manga getManga(Long id);
	List<Manga> getAllMangas();
	List<Manga> findByNomManga(String nom);
	List<Manga> findByNomMangaContains(String nom);
	List<Manga> findByNomPrix (String nom, Double prix);
	List<Manga> findByDemographie (Demographie demographie);
	List<Manga> findByDemographieIdCat(Long id);
	List<Manga> findByOrderByNomMangaAsc();
	List<Manga> trierMangasNomsPrix();

}
