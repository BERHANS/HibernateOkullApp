package com.berhan.service;

import com.berhan.repository.OgrenciRepository;
import com.berhan.repository.entity.Ogrenci;


import java.util.List;
import java.util.Optional;

public class OgrenciServis {

    OgrenciRepository ogrenciRepository;


    public OgrenciServis(){
        this.ogrenciRepository = new OgrenciRepository();
    }

    public Ogrenci save(Ogrenci ogrenci){
        return ogrenciRepository.save(ogrenci);
    }

    public void update(Ogrenci ogrenci){
        ogrenciRepository.update(ogrenci);
    }

    public List<Ogrenci> findAll(){
        return ogrenciRepository.findAll();
    }

    public Optional<Ogrenci> findById(Long id){
        return ogrenciRepository.findById(id);
    }

}
