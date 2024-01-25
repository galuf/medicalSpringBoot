package com.mitocode.mediappbackend.service;

import com.mitocode.mediappbackend.model.Patient;

import java.util.List;

public interface ICrud <T, ID>{
    T save(T t) throws Exception;

    T update(ID id, T t) throws Exception;

    List<T> findAll() throws Exception;

    T findById(ID id) throws Exception;

    void delete(ID id) throws Exception;

}
