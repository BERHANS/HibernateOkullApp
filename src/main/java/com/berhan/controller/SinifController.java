package com.berhan.controller;


import com.berhan.repository.SinifRepository;
import com.berhan.repository.entity.Sinif;
import java.util.List;
import java.util.Optional;

public class SinifController {
    SinifRepository sinifRepository;


    public SinifController(){
        this.sinifRepository = new SinifRepository();
    }

    public Sinif save(Sinif sinif){
        return sinifRepository.save(sinif);
    }

    public void update(Sinif sinif){
        sinifRepository.update(sinif);
    }

    public List<Sinif> findAll(){
        return sinifRepository.findAll();
    }

    public Optional<Sinif> findById(Long id){
        return sinifRepository.findById(id);
    }
}
