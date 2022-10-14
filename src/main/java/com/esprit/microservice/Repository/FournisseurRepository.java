package com.esprit.microservice.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.esprit.microservice.Entity.Fournisseur;
public interface FournisseurRepository extends JpaRepository<Fournisseur,Integer> {

}
