package com.takeout.repository;

import com.takeout.entity.Type;

import java.util.List;

public interface TypeRepository {

    public Type findById(long id);
    public List<Type> findAll();
}
