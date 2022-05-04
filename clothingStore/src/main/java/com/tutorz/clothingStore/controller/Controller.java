package com.tutorz.clothingStore.controller;

import com.tutorz.clothingStore.entity.Brand;
import com.tutorz.clothingStore.entity.Garment;
import com.tutorz.clothingStore.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class Controller {

    @Autowired
    private BrandService service;

    @GetMapping
    public List<Brand> getAllBrands(){
        return service.findAllBrands();
    }

    @PostMapping("post/brand")
    public Brand postBrand(@RequestBody Brand brand){
        return service.createBrand(brand);
    }

    @PostMapping("post/garment")
    public Brand postGarment(@RequestBody Garment garment){
        return service.createGarment(garment);
    }

    @DeleteMapping("delete/brand")
    public void deleteBrand(@RequestBody Brand brand){
        service.deleteBrand(brand);
    }

    @DeleteMapping("delete/garment")
    public void deleteGarment(@RequestBody Garment garment){
        service.deleteGarment(garment);
    }

}
