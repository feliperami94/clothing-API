package com.tutorz.clothingStore.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Brand")
@Table(name = "brand")
@Data
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<Garment> garmentList = new ArrayList<>();

    public Brand addGarment(Garment garment){
        this.garmentList.add(garment);
        return this;
    }
}
