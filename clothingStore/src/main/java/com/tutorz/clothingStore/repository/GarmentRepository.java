package com.tutorz.clothingStore.repository;

import com.tutorz.clothingStore.entity.Garment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarmentRepository extends JpaRepository<Garment, Long> {
}
