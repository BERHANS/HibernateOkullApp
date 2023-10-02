package com.berhan.utility;

import java.util.List;
import java.util.Optional;

public interface ICrud<T>{

    List<T> findAll();

    Optional<T> findById(Long id);

    T save(T entity);

    void update(T entity);
}
