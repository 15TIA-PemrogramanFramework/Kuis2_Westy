/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1086.repo;

import com.example.kuis_1086.entity.Identitas_1086;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface Identitas_1086_Repo extends CrudRepository<Identitas_1086, Long> {

    @Query("select c from Identitas_1086 c")
    public List<Identitas_1086> findAllIdentitas_1086();
}
