package com.mitocode.mediappbackend.service.impl;

import com.mitocode.mediappbackend.exception.ModelNotFoundException;
import com.mitocode.mediappbackend.repo.IGenericRepo;
import com.mitocode.mediappbackend.service.ICrud;

import java.util.List;

public abstract class CrudImpl <T, ID> implements ICrud<T, ID>  {

    protected abstract IGenericRepo<T, ID> getRepo();

    @Override
    public T save(T t) throws Exception {
        return getRepo().save(t);
    }

    @Override
    public T update(ID id, T t) throws Exception {
        return getRepo().save(t);
    }

    @Override
    public List<T> findAll() throws Exception {
        return getRepo().findAll();
    }

    @Override
    public T findById(ID id) throws Exception {
        return getRepo().findById(id).orElseThrow(() -> new ModelNotFoundException("ID NOT FOUND: " + id));
    }

    @Override
    public void delete(ID id) throws Exception {
        getRepo().deleteById(id);
    }
}
