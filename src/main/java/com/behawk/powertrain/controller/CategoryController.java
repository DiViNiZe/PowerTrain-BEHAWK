/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.controller;

import com.behawk.powertrain.Repository.CategoryRepository;
import com.behawk.powertrain.model.Category;
import java.util.List;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author benz
 */
@RestController
public class CategoryController {
    private CategoryRepository categoryRepo;
    
    @GetMapping("/category")
    public List<Category> getAllCategory(){
        return categoryRepo.findAll();
    }
}
