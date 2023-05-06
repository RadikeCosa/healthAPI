package com.cnt.healthAPI.controller;

import com.cnt.healthAPI.model.Patient;
import com.cnt.healthAPI.service.IPatientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT })
public class PatientController {

    @Autowired
    private IPatientService iPatientService;

    @GetMapping("/api/v1/patients")
    public List<Patient> getPatients(){
        return iPatientService.getPatients();
    }

    @PostMapping("/api/v1/patients")
    public String createPatient(@RequestBody Patient patient){
        iPatientService.savePatient(patient);
        return "el paciente fue debidamente registrado";
    }

    @DeleteMapping("/api/v1/patients/{id}")
    public String deletePatient (@PathVariable Long id) {
        iPatientService.deletePatient(id);
        return "el paciente fue correctamente eliminado";
    }

    @PutMapping("/api/v1/patients/{id}")
    public Patient editPatient (@PathVariable Long id,
                                @RequestParam ("name") String newName,
                                @RequestParam("lastName") String newLastName,
                                @RequestParam("os") String newOs,
                                @RequestParam("address") String newAddress,
                                @RequestParam("phone") String newPhone,
                                @RequestParam("diagnosis") String newDiagnosis,
                                @RequestParam("image") String newImage,
                                @RequestParam("isActive") Boolean newIsActive) {

        Patient patient = iPatientService.findPatient(id);
        patient.setName(newName);
        patient.setLastName(newLastName);
        patient.setOs(newOs);
        patient.setAddress(newAddress);
        patient.setPhone(newPhone);
        patient.setDiagnosis(newDiagnosis);
        patient.setImage(newImage);
        patient.setIsActive(newIsActive);

        return patient;

    }

}
