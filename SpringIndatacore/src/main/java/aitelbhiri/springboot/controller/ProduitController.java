package aitelbhiri.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import aitelbhiri.springboot.model.Produit;
import aitelbhiri.springboot.service.ProduitService;

import java.util.List;

@RestController
@RequestMapping("/api/produits")
public class ProduitController {

 @Autowired
 private ProduitService produitService;

 @GetMapping
 public List<Produit> getAllProduits() {
     return produitService.getAllProduits();
 }

 @PostMapping
 public Produit addProduit(@RequestBody Produit produit) {
     return produitService.addProduit(produit);
 }

 @PostMapping("/random")
 public Produit addRandomProduit() {
     return produitService.addRandomProduit();
 }
}

