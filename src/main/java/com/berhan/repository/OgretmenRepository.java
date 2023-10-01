package com.berhan.repository;

import com.berhan.Criteria.Methods;
import com.berhan.repository.entity.Ogretmen;

public class OgretmenRepository extends Methods<Ogretmen> {
    public OgretmenRepository() {
        super(new Ogretmen());
    }
}
