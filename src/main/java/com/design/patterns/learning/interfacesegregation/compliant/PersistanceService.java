package com.design.patterns.learning.interfacesegregation.compliant;

public interface PersistanceService<T> {

    void save(T entity);

    void delete(T entity);

    T findById(long id);

}
