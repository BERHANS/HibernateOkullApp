package com.berhan.repository;

import com.berhan.utility.Methods;
import com.berhan.repository.entity.Ogrenci;

public class OgrenciRepository extends Methods<Ogrenci> {
    public OgrenciRepository() {
        super(new Ogrenci());
    }
}
