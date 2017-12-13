/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1086.service;

import com.example.kuis_1086.entity.Identitas_1086;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.kuis_1086.repo.Identitas_1086_Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("Identitas_1086_Service")
@Transactional
public class Identitas_1086_Service {

    @Autowired
    private Identitas_1086_Repo repo;

    public Identitas_1086 insert(Identitas_1086 identitas_1086) {
        return repo.save(identitas_1086);
    }
    
    public Identitas_1086 update(Identitas_1086 identitas_1086) {
        return repo.save(identitas_1086);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Identitas_1086 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Identitas_1086> getAll(){
        return repo.findAllIdentitas_1086();
    }
}
