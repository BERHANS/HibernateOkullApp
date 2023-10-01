package com.berhan.repository;

import com.berhan.Criteria.Methods;
import com.berhan.repository.entity.Ogretmen;
import com.berhan.repository.entity.Sinif;

public class SinifRepository extends Methods<Sinif> {
    public SinifRepository() {
        super(new Sinif());
    }
}
