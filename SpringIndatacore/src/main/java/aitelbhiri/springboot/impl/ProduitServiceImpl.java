package aitelbhiri.springboot.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aitelbhiri.springboot.model.Produit;
import aitelbhiri.springboot.repository.ProduitRepository;
import aitelbhiri.springboot.service.ProduitService;

import java.util.List;
import java.util.Random;

@Service
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit addRandomProduit() {
        Random random = new Random();
        Produit randomProduit = new Produit("RandomProduit", random.nextDouble());
        return produitRepository.save(randomProduit);
    }
}
