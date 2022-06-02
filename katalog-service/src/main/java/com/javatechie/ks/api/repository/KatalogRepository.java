package com.javatechie.ks.api.repository;

import com.javatechie.ks.api.entity.Katalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KatalogRepository extends JpaRepository<Katalog,Integer> {
}
