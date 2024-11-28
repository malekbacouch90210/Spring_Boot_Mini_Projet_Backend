package com.malek.manga.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.malek.manga.entities.Manga;
import com.malek.manga.service.MangaService;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class MangaRESTcontroller {
	@Autowired
	MangaService mangaService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Manga> getAllMangas() {
		return mangaService.getAllMangas();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Manga getMangaById(@PathVariable("id") Long id){
		return mangaService.getManga(id);
	}
	@RequestMapping(method = RequestMethod.POST)
	public Manga createManga(@RequestBody Manga manga) {
		return mangaService.saveManga(manga);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Manga updateManga(@RequestBody Manga manga) {
		return mangaService.updateManga(manga);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteManga(@PathVariable("id") Long id)
	{
		mangaService.deleteMangaById(id);
	}
	@RequestMapping(value="/manscat/{idCat}",method = RequestMethod.GET)
	public List<Manga> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
	    return mangaService.findByDemographieIdCat(idCat);
	}
	@RequestMapping(value="/mansByName/{nom}",method = RequestMethod.GET)
		public List<Manga> findByNomMangaContains(@PathVariable("nom") String nom) {
		return mangaService.findByNomMangaContains(nom);
	}
	
}
