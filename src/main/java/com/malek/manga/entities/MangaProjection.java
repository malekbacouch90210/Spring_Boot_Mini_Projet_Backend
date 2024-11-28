package com.malek.manga.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomMan", types = { Manga.class })
public interface MangaProjection {
	public String getnomManga();
}
