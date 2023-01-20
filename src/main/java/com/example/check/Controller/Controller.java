package com.example.check.Controller;

import com.example.check.Entity.Product;
import com.example.check.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/base")
public class Controller {
    @Autowired
    private ProductService service;
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }
    @PostMapping("/addAllProducts")
    public List<Product> addAllProducts(@RequestBody List<Product> products){
        return service.saveAll(products);
    }
    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts(){
        return service.getProducts();
    }
    @GetMapping("/getProductByID/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProduct(id);
    }
    @GetMapping("/getProductByName/{name}")
    public Product getProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }
    @DeleteMapping("/deleteProductById/{id}")
    public String deleteProductById(@PathVariable int id){
        return service.deleteProduct(id);
    }
    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }
}
