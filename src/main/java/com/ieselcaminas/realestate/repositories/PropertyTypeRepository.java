package com.ieselcaminas.realestate.repositories;

import com.ieselcaminas.realestate.entities.PropertyType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PropertyTypeRepository extends JpaRepository<PropertyType, Integer> {
    public PropertyType findOneById(long id);
    public List<PropertyType> findAll();
}
