package com.ieselcaminas.realestate.controllers;

import com.ieselcaminas.realestate.repositories.PropertyTypeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ieselcaminas.realestate.entities.PropertyType;
import com.ieselcaminas.realestate.repositories.PropertyRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class ZonaPublicaController {
    
    @Autowired
    PropertyTypeRepository propertyTypeRepository;

    @Autowired
    PropertyRepository propertyRepository;

    @ModelAttribute("propertyTypes")
    public List<PropertyType> propertyTypes(){
        return  propertyTypeRepository.findAll();
    }
    
    @GetMapping("/")
    public String inicio(Model model){
        model.addAttribute("properties", propertyRepository.findAll());
        return "index";
    }
 
    @GetMapping("/search")
    public String search(Model model, @RequestParam(name="q", required = false) String query, @RequestParam(name="propertyTypeId", required = false) long propertyTypeId){
        PropertyType propertyType = propertyTypeRepository.findOneById(propertyTypeId);
        if (propertyType != null)
            model.addAttribute("properties", propertyRepository.findByPropertyTypeAndTitleContainsIgnoreCase(propertyType, query));
        else
            model.addAttribute("properties", propertyRepository.findByTitleContainsIgnoreCase(query));
        return "search";
    }
    
}