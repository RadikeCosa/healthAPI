package com.cnt.healthAPI.repository;


import com.cnt.healthAPI.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientRepository extends JpaRepository <Patient, Long> {
}
