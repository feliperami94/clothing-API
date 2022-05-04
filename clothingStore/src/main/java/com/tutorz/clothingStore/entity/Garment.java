package com.tutorz.clothingStore.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Garment")
@Table(name = "garment")
@Data
public class Garment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type; //shirt, pants, jacket, etc...
    private Integer price;
    private String color;
    private Long fkBrandId;

}
