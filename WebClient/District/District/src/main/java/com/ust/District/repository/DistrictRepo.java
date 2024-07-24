package com.ust.District.repository;

import com.ust.District.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DistrictRepo extends JpaRepository<District,Long> {
    Optional<List<District>> findByStateCode(String code);
}
