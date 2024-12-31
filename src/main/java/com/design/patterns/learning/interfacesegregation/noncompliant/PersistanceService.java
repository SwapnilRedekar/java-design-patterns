package com.design.patterns.learning.interfacesegregation.noncompliant;

public interface PersistanceService<T> {
    void save(T entity);
    void delete(T entity);
    T findById(long id);
    T findByName(String name);

}
