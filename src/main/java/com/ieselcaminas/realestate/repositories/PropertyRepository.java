
package com.ieselcaminas.realestate.repositories;

import com.ieselcaminas.realestate.entities.Property;
import com.ieselcaminas.realestate.entities.PropertyType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface PropertyRepository extends JpaRepository<Property, Long>{
    
    public Property findById(long id);
    
    public List<Property> findAll();

    public List<Property> findByPropertyTypeAndTitleContainsIgnoreCase(PropertyType propertyType, String title);

    public List<Property> findByTitleContainsIgnoreCase(String title);
}
