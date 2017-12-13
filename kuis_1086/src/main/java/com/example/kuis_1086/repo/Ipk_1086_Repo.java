/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1086.repo;

import com.example.kuis_1086.entity.Ipk_1086;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Hendro Steven
 */
public interface Ipk_1086_Repo extends CrudRepository<Ipk_1086, Long>{
    
    @Query("select p from Ipk_1086 p")
    public List<Ipk_1086> findAllIpk_1086();

}
