package aitelbhiri.springboot.service;

import java.util.List;

import aitelbhiri.springboot.model.Produit;

public interface ProduitService {
 List<Produit> getAllProduits();

 Produit addProduit(Produit produit);

 Produit addRandomProduit();
}
