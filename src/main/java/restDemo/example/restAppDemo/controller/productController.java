package restDemo.example.restAppDemo.controller;
import org.springframework.web.bind.annotation.*;
import restDemo.example.restAppDemo.entities.product;
import org.springframework.beans.factory.annotation.Autowired;
import restDemo.example.restAppDemo.repository.productRepository;

import java.util.List;

@RestController
public class productController {

    @Autowired
    productRepository repository;

    @GetMapping("/products/")
    public List<product> getProducts(){
        return repository.findAll();
    }

    @GetMapping("/products/{id}")
    public product getProductById(@PathVariable("id") int id){
        return repository.findById(id).get();
    }

    @PostMapping("/products/")
    public product addProduct(@RequestBody product product){
        return repository.save(product);
    }

    @PutMapping ("/products/")
    public product updateProduct(@RequestBody product product){
        return repository.save(product);
    }

    @DeleteMapping ("/products/{id}")
    public void deleteProduct(@PathVariable("id") int id){
        repository.deleteById(id);
    }
}
