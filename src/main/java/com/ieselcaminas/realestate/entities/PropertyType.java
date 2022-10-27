package com.ieselcaminas.realestate.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="property_type")
public class PropertyType {
    
    @Id @GeneratedValue
    private long id;

    private String name;

    public PropertyType(){

    }

    public PropertyType(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    
}
