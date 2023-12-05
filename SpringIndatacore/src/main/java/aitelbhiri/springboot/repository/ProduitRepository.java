package aitelbhiri.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aitelbhiri.springboot.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
