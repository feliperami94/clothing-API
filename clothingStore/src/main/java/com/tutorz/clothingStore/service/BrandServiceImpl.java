package com.tutorz.clothingStore.service;

import com.tutorz.clothingStore.entity.Brand;
import com.tutorz.clothingStore.entity.Garment;
import com.tutorz.clothingStore.repository.BrandRepository;
import com.tutorz.clothingStore.repository.GarmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.stream.events.Comment;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService{

    @Autowired
    public BrandRepository brandRepository;

    @Autowired
    public GarmentRepository garmentRepository;

    @Override
    public Brand createBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public Brand createGarment(Garment garment) {
        Brand brand = brandRepository.findById(garment.getFkBrandId()).get();
        brand.addGarment(garment);
        garmentRepository.save(garment);
        return brandRepository.save(brand);

    }

    @Override
    public void deleteGarment(Garment garment) {
        garmentRepository.deleteById(garment.getId());
    }

    @Override
    public void deleteBrand(Brand brand) {
        Brand brandToBeDeleted = brandRepository.findById(brand.getId()).get();
        if(!brandToBeDeleted.getGarmentList().isEmpty()){
            brandToBeDeleted.getGarmentList().forEach(garment -> garmentRepository.deleteById(garment.getId()));
        }
        brandRepository.deleteById(brand.getId());

    }

    @Override
    public List<Brand> findAllBrands() {
        return brandRepository.findAll();
    }
}
