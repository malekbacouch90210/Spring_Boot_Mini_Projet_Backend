package com.malek.manga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malek.manga.entities.Demographie;
import com.malek.manga.entities.Manga;
import com.malek.manga.repos.MangaRepository;


@Service
public class MangaServiceImpl implements MangaService{
	
	@Autowired
	MangaRepository mangaRepository;

	@Override
	public Manga saveManga(Manga m) {
		return mangaRepository.save(m);
		
	}

	@Override
	public Manga updateManga(Manga m) {
		return mangaRepository.save(m);
	}

	@Override
	public void deleteManga(Manga m) {
		mangaRepository.delete(m);
		
		
	}

	@Override
	public void deleteMangaById(Long id) {
		mangaRepository.deleteById(id);

		
	}

	@Override
	public Manga getManga(Long id) {
		return mangaRepository.findById(id).get();
	}

	@Override
	public List<Manga> getAllMangas() {
		return mangaRepository.findAll();
	}

	@Override
	public List<Manga> findByNomManga(String nom) {
		return mangaRepository.findByNomManga(nom);
	}

	@Override
	public List<Manga> findByNomMangaContains(String nom) {
		return mangaRepository.findByNomMangaContains(nom);
	}

	@Override
	public List<Manga> findByNomPrix(String nom, Double prix) {
		return mangaRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Manga> findByDemographie(Demographie demographie) {
		return mangaRepository.findByDemographie(demographie);
	}

	@Override
	public List<Manga> findByDemographieIdCat(Long idCat) {
	    return mangaRepository.findByDemographieIdCat(idCat);
	}

	@Override
	public List<Manga> findByOrderByNomMangaAsc() {
		return mangaRepository.findByOrderByNomMangaAsc();
	}

	@Override
	public List<Manga> trierMangasNomsPrix() {
		return mangaRepository.trierMangasNomsPrix();
	}
	

}
