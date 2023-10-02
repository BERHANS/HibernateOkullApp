package com.berhan.controller;

import com.berhan.repository.entity.Ogrenci;
import com.berhan.service.OgrenciServis;

import java.util.List;
import java.util.Optional;

public class OgrenciController {

    OgrenciServis ogrenciServis;

    public OgrenciController(){
        this.ogrenciServis=new OgrenciServis();
    }
    public Ogrenci save(Ogrenci ogrenci){
        return ogrenciServis.save(ogrenci);
    }

    public void update(Ogrenci ogrenci){
        ogrenciServis.update(ogrenci);
    }

    public List<Ogrenci> findAll(){
        return ogrenciServis.findAll();
    }

    public Optional<Ogrenci> findById(Long id){
        return ogrenciServis.findById(id);
    }

}
