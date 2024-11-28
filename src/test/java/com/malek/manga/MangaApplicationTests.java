package com.malek.manga;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.malek.manga.entities.Manga;
import com.malek.manga.entities.Demographie;
import com.malek.manga.repos.MangaRepository;

@SpringBootTest
class MangaApplicationTests {

	@Autowired
	private MangaRepository mangaRepository;
	@Test
	public void testCreateManga() {
		Manga man = new Manga("Monster ",1600.000,new Date(),"Urasawa Naoki","M@gmail.com","505kinderhamen");
		mangaRepository.save(man);
	}
	@Test
	public void testFindManga(){ 
		Manga m = mangaRepository.findById(1L).get();
		System.out.println(m);
	}
	@Test
	public void testUpdateManga(){
		Manga m = mangaRepository.findById(1L).get();
		m.setPrixManga(1000.0);
		mangaRepository.save(m);
	}
	@Test
	public void testDeleteManga(){
		mangaRepository.deleteById(1L);;
	}
	
	@Test
	public void testListerTousMangas()
	{
		List<Manga> mans = mangaRepository.findAll();
		for (Manga m : mans){
			System.out.println(m);
		}
	}
	
	@Test
	public void testFindByNomManga()
	{
		List<Manga> prods = mangaRepository.findByNomManga("Attack on titan");
		for (Manga m : prods)
		{
			System.out.println(m);
		}
	}
	@Test
	public void testFindByNomMangaContains ()
	{
		List<Manga> mans=mangaRepository.findByNomMangaContains("a");
		for (Manga m : mans)
		{
			System.out.println(m);
		} 
	}
	
	@Test public void testfindByNomPrix()
	{
		List<Manga> mans = mangaRepository.findByNomPrix("One piece ", 1000.0);
		for (Manga m : mans)
		{
			System.out.println(m);
		}
	}
	
	@Test
	public void testfindByDemographie()
	{
		Demographie cat = new Demographie();
		cat.setIdCat(1L);
		List<Manga> mans = mangaRepository.findByDemographie(cat);
		for (Manga p : mans)
		{
			System.out.println(p);
		}
	}
	
	@Test
	public void findByCategorieIdCat()
	{
		List<Manga> mans = mangaRepository.findByDemographieIdCat(2L);
		for (Manga m : mans)
		{
			System.out.println(m);
		}
	}
	
	@Test
	public void testfindByOrderByNomMangaAsc()
	{
		List<Manga> mans = mangaRepository.findByOrderByNomMangaAsc();
		for (Manga m : mans)
		{
			System.out.println(m);
		}
	}
	
	@Test public void testTrierProduitsNomsPrix()
	{
		List<Manga> mans = mangaRepository.trierMangasNomsPrix();
		for (Manga m : mans)
		{
			System.out.println(m);
		}
	}
	
	
	
	
	
	
	

}
