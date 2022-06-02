package com.javatechie.ks.api.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javatechie.ks.api.entity.Katalog;
import com.javatechie.ks.api.repository.KatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KatalogService {

    @Autowired
    private KatalogRepository repository;

    public Katalog saveProduct(Katalog katalog) {

        return repository.save(katalog);
    }
}
