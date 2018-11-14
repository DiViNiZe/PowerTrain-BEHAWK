/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.behawk.powertrain.controller;

import org.springframework.web.bind.annotation.*;

/**
 *
 * @author benz
 */
@RestController
public class CategoryController {
    @GetMapping("/category")
    public int getAllCategory(){
        return 0;
    }
}
