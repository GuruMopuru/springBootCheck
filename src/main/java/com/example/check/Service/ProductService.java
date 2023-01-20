package com.example.check.Service;

import com.example.check.Entity.Product;
import com.example.check.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;

    public Product saveProduct(Product product){
        return repo.save(product);
    }

    public List<Product> saveAll(List<Product> products){
        return repo.saveAll(products);
    }

    public Product getProduct(int id){
        return repo.findById(id).orElse(null);
    }

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductByName(String name){
        return repo.findByName(name);
    }

    public String deleteProduct(int id){
        repo.deleteById(id);
        return "deleted"+id;
    }

    public Product updateProduct(Product product){
        Product existingProduct =repo.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        return repo.save(existingProduct);
    }
    }
