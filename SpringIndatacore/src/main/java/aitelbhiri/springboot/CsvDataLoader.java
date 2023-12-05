package aitelbhiri.springboot;


import com.opencsv.CSVReader;

import aitelbhiri.springboot.model.Produit;
import aitelbhiri.springboot.service.ProduitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.FileReader;

@Component
public class CsvDataLoader implements CommandLineRunner {

 @Autowired
 private ProduitService produitService;

 @Override
 public void run(String... args) throws Exception {
     loadCsvData();
 }

 private void loadCsvData() {
     try (CSVReader reader = new CSVReader(new FileReader(new ClassPathResource("data.csv").getFile()))) {
         String[] line;
         while ((line = reader.readNext()) != null) {
             String name = line[0];
             double price = Double.parseDouble(line[1]);

             Produit produit = new Produit(name, price);
             produitService.addProduit(produit);
         }
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}
