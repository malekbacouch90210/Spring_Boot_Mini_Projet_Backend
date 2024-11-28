package com.malek.manga.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.malek.manga.entities.Demographie;


@RepositoryRestResource(path = "cat") 
@CrossOrigin(origins= "http://localhost:4200/") //pour autoriser angular
public interface DemographieRepository extends JpaRepository <Demographie , Long> {

}
