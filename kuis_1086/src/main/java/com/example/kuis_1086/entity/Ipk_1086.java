/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1086.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "tbl_ipk_1086")
public class Ipk_1086 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String nilai;
    @Column(length = 255, nullable = true)
    private String batas_awal;
    @Column(length = 255, nullable = true)
    private String batas_akhir;
    
    
      @ManyToOne
    private Identitas_1086 identitas_1086;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id= id;
    }

    /**
     * @return the name
     */
    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }
    public String getBatasAwal() {
        return batas_awal;
    }

    public void setBatasAwal(String batas_awal) {
        this.batas_awal = batas_awal;
    }
    public String getBatasAkhir() {
        return batas_akhir;
    }

    public void setBatasAkhir(String batas_akhir) {
        this.batas_akhir = batas_akhir;
    }  

}
