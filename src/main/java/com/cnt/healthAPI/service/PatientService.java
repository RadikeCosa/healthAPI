package com.cnt.healthAPI.service;

import com.cnt.healthAPI.model.Patient;
import com.cnt.healthAPI.repository.IPatientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService implements IPatientService {

    @Autowired
    private IPatientRepository patientRepository;

    @Override
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    @Override
    public void savePatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }

    @Override
    public Patient findPatient(Long id) {
        return patientRepository.findById(id).orElse(null);
    }
}
