package com.javatechie.ks.api.controller;


import com.javatechie.ks.api.entity.Katalog;
import com.javatechie.ks.api.service.KatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/katalog")
public class KatalogController {

    @Autowired
    KatalogService service;

    @PostMapping("/product")
    public Katalog productKatalog(@RequestBody  Katalog katalog){
        return service.saveProduct(katalog);
    }



}
