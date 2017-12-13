/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1086.controller;

import com.example.kuis_1086.entity.Identitas_1086;
import com.example.kuis_1086.service.Identitas_1086_Service;
import java.util.List;
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
@RequestMapping("/identitas_1086")
public class Identitas_1086_Controller {

    @Autowired
    private Identitas_1086_Service identitas_1086Service;

    @RequestMapping(method = RequestMethod.POST)
    public Identitas_1086 insert(@RequestBody Identitas_1086 identitas_1086) {
        return identitas_1086Service.insert(identitas_1086);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Identitas_1086 update(@RequestBody Identitas_1086 identitas_1086) {
        return identitas_1086Service.update(identitas_1086);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return identitas_1086Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Identitas_1086 getById(@PathVariable("id") Long id){
        return identitas_1086Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Identitas_1086> getAll(){
        return identitas_1086Service.getAll();
    }
}
