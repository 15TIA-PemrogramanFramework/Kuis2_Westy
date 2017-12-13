/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1086.controller;

import com.example.kuis_1086.entity.Ipk_1086;
import com.example.kuis_1086.repo.Ipk_1086_Repo;
import com.example.kuis_1086.service.Ipk_1086_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/ipk_1086")
public class Ipk_1086_Controller {
    
    @Autowired
    private Ipk_1086_Service productService;
    
    @RequestMapping(method = RequestMethod.POST)
    public Ipk_1086 insertOrUpdate(@RequestBody Ipk_1086 ipk_1086){
        return productService.insertOrUpdate(ipk_1086);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return productService.delete(id);
    }
  
}
