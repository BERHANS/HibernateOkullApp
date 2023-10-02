package com.berhan.controller;

import com.berhan.repository.OgretmenRepository;
import com.berhan.repository.entity.Ogretmen;

import java.util.List;
import java.util.Optional;

public class OgretmenController {

    OgretmenRepository ogretmenRepository;

    public OgretmenController(){
        this.ogretmenRepository = new OgretmenRepository();
    }
    public Ogretmen save(Ogretmen ogretmen){
        return ogretmenRepository.save(ogretmen);
    }

    public void update(Ogretmen ogretmen){
        ogretmenRepository.update(ogretmen);
    }

    public List<Ogretmen> findAll(){
        return ogretmenRepository.findAll();
    }

    public Optional<Ogretmen> findById(Long id){
        return ogretmenRepository.findById(id);
    }
}
