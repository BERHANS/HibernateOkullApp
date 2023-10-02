package com.berhan.utility;

import java.util.List;
import java.util.Optional;

public interface ICrud<T,ID>{

    List<T> findAll();

    Optional<T> findById(ID id);

    T save(T entity);

    void update(T entity);
    Iterable<T> saveAll(Iterable<T> entities);
    void delete(T entity);
    void deleteById(ID id);
    boolean existById(ID id);
    List<T> findByEntity(T entity);
    List<T> findByColumnNameAndValue(String cloumnName, String value);
}
