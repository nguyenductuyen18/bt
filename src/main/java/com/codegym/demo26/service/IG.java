package com.codegym.demo26.service;

import java.util.Optional;

public interface IG<T>{
    Iterable<T> findAll();
    Optional<T> findById(int id);
    T save(T t);
    void deleteById(int id);
//    Optional<T> f(Long id);

}
