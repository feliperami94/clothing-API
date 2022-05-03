package com.example.clothing.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name="Brand")
@Table(name="brand")
@Data
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brandName;
    private String country;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )

    private List<Clothing> clothingList;

    public Brand addGarment(Clothing garment){
        this.clothingList.add(garment);
        return this;
    }
}
