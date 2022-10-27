package com.ieselcaminas.realestate.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.ieselcaminas.realestate.entities.PropertyType;
import javax.persistence.ManyToOne;

@Entity(name = "properties")
public class Property {
    @Id @GeneratedValue
    private long id;

    @ManyToOne
    private PropertyType propertyType;

    private long price;

    private String title;

    private String address;

    private String image;

    public Property(){
        
    }
    public Property(PropertyType propertyType, long price, String title, String address, String image) {
        this.propertyType = propertyType;
        this.price = price;
        this.title = title;
        this.address = address;
        this.image = image;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public PropertyType getPropertyType() {
        return propertyType;
    }
    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    
}
