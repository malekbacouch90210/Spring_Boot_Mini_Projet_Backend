package com.malek.manga.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.malek.manga.entities.Demographie;
import com.malek.manga.entities.Manga;

@RepositoryRestResource(path = "rest")
public interface MangaRepository extends JpaRepository<Manga, Long> {
	List<Manga> findByNomManga(String nom);
	List<Manga> findByNomMangaContains(String nom);
	
	/*@Query("select m from Manga m where m.nomManga like %?1 and m.prixManga> ?2")
	List<Manga> findByNomPrix (String nom, Double prix);*/
	
	@Query("select m from Manga m where m.nomManga like %:nom and m.prixManga > :prix")
	List<Manga> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	
	@Query("select m from Manga m where m.demographie = ?1") 
	List<Manga> findByDemographie(Demographie demographie);
	
	List<Manga> findByDemographieIdCat(Long id);
	
	List<Manga> findByOrderByNomMangaAsc();
	
	@Query("select m from Manga m order by m.nomManga ASC, m.prixManga DESC")
	List<Manga> trierMangasNomsPrix ();
	
	
}
