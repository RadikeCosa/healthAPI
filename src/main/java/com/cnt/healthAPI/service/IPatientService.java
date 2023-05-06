package com.cnt.healthAPI.service;

import com.cnt.healthAPI.model.Patient;
import java.util.List;

public interface IPatientService {


    public List<Patient> getPatients ();

    public void savePatient (Patient patient);

    public void deletePatient (Long id);

    public Patient findPatient (Long id);

}
