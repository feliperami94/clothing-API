package com.example.clothing.controller;

import com.example.clothing.entity.Clothing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clothes")
public class ClothingController {

    @Autowired
    private ClothingRepository clothingRepo;

    @PostMapping
    public void insertClothing(@RequestBody Clothing garment){
        clothingRepo.insert(garment);
    }
}
