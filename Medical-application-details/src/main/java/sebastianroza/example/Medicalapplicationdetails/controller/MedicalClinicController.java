package sebastianroza.example.Medicalapplicationdetails.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sebastianroza.example.Medicalapplicationdetails.client.Localhost8082;
import sebastianroza.example.Medicalapplicationdetails.model.dto.DoctorDTO;
import sebastianroza.example.Medicalapplicationdetails.model.dto.FacilityDTO;
import sebastianroza.example.Medicalapplicationdetails.model.dto.PatientDTO;
import sebastianroza.example.Medicalapplicationdetails.model.entity.CombinedMedicalDetails;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/medical-clinic")
public class MedicalClinicController {
    @Autowired
    private final Localhost8082 localhost8082;

    @GetMapping("/details")
    public CombinedMedicalDetails getCombinedData() {
        List<DoctorDTO> doctors = localhost8082.getDoctors();
        List<PatientDTO> patients = localhost8082.getPatients();
        List<FacilityDTO> facilities = localhost8082.getFacilities();
        CombinedMedicalDetails response = new CombinedMedicalDetails(doctors, patients, facilities);
        return response;
    }
}
