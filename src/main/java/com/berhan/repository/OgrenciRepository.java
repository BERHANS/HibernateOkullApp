package com.berhan.repository;

import com.berhan.Criteria.Methods;
import com.berhan.repository.entity.Ogrenci;
import com.berhan.repository.entity.Ogretmen;

public class OgrenciRepository extends Methods<Ogrenci> {
    public OgrenciRepository() {
        super(new Ogrenci());
    }
}
