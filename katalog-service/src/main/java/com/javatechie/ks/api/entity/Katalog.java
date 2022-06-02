package com.javatechie.ks.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "KATALOG_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Katalog {

    @Id
    private int productId;
    private String productName;
    private String productDesc;
    private int stok;
    private double price;
}
