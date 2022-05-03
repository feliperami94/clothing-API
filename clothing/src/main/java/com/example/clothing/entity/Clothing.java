package com.example.clothing.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name="Clothing")
@Table(name="clothing")
@Data
public class Clothing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String marca;
    private String prenda;
    private Character talla;
    private Integer precio;
    private Long fkBrandId;

}
