package com.behawk.powertrain.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.behawk.powertrain.model.Product;
import com.behawk.powertrain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "*")
@RestController
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @GetMapping("/products")
    public List<Product> getProductbyProduct(@RequestParam(required = false) String product){
        List<Product> productList = productService.findAllProduct(); 
        return productService.findAllProduct();
    }
    
    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable long id){
        return productService.findProductById(id);
    }

    @GetMapping("/product/campaign/{campaign_name}")
    public ResponseEntity<List<Product>> getProductByCampaignName(
        @RequestParam("campaign_name") String targetCampaignName,
        @RequestParam("sortBy") String sortType,
        @RequestParam("pageNumber")int paging){
            return null;
    }
    
    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
    
    @PutMapping("/product")
    public Product editProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }
    
    @DeleteMapping("/product/{id}")
    public boolean deleteProduct(@RequestBody long id){
       return productService.deleteProductById(id);
    }
}


