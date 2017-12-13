/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1086.service;

import com.example.kuis_1086.entity.Ipk_1086;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.kuis_1086.repo.Ipk_1086_Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("ipk_1086Service")
@Transactional
public class Ipk_1086_Service {

    @Autowired
    private Ipk_1086_Repo repo;

    public Ipk_1086 insertOrUpdate(Ipk_1086 ipk_1086) {
        return repo.save(ipk_1086);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<Ipk_1086> findAll() {
        return repo.findAllIpk_1086();
    }

    
}
