package com.tutorz.clothingStore.service;

import com.tutorz.clothingStore.entity.Brand;
import com.tutorz.clothingStore.entity.Garment;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BrandService {

    Brand createBrand(Brand brand);

    Brand createGarment(Garment garment);

    void deleteGarment(Garment garment);

    void deleteBrand(Brand brand);

    List<Brand> findAllBrands();
}
