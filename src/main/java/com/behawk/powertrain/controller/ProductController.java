package com.behawk.powertrain.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.behawk.powertrain.model.Product;
import com.behawk.powertrain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @GetMapping("/products")
    public List<Product> getProductbyProduct(@RequestParam(required = false) String product){
        List<Product> productList = productService.findAllProduct(); 
        return productService.findAllProduct();
    }
    @GetMapping("/products/{campaign_name}")
    public ResponseEntity<List<Product>> getProductByCampaignName(
        @RequestParam("campaign_name") String targetCampaignName,
        @RequestParam("sortBy") String sortType,
        @RequestParam("pageNumber")int paging){
            return null;
    }

    @GetMapping("/product/{id}")
    public long getProductById(@PathVariable long id){
        return id;
    }

    @GetMapping("/products/bestSell")
    public ResponseEntity<List<Product>> getBestSellProduct(){
        return null;
    }


}