package io.labs.shoppingserver.services.implement;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

public abstract class CrudServiceImpl<T, ID extends Serializable>{
    protected abstract JpaRepository<T, ID> getRepository();

    public List<T> findAll() {
        return getRepository().findAll();
    }

    public List<T> findAll(Sort sort) {
        return getRepository().findAll(sort);
    }

    public Page<T> findAll(Pageable pageable) {
        return getRepository().findAll(pageable);
    }

    public T save(T entity) {
        return getRepository().save(entity);
    }

    public T saveAndFlush(T entity) {
        return getRepository().saveAndFlush(entity);
    }

    public Iterable<T> save(Iterable<T> iterable) {
        return getRepository().saveAll(iterable);
    }

    public void flush() {
        getRepository().flush();
    }

    public T findById(ID id) {
        return getRepository().findById(id).orElse(null);
    }

    public boolean exists(ID id) {
        return getRepository().existsById(id);
    }


    @Transactional(readOnly = true)
    public long count() {
        return getRepository().count();
    }

    public void delete(ID id) {
        getRepository().deleteById(id);
    }

    public void delete(Iterable<? extends T> iterable) {
        getRepository().deleteAll(iterable);
    }

    public void deleteAll() {
        getRepository().deleteAll();
    }
}
