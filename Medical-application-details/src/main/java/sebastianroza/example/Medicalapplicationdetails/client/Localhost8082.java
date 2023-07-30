package sebastianroza.example.Medicalapplicationdetails.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import sebastianroza.example.Medicalapplicationdetails.model.dto.DoctorDTO;
import sebastianroza.example.Medicalapplicationdetails.model.dto.FacilityDTO;
import sebastianroza.example.Medicalapplicationdetails.model.dto.PatientDTO;

import java.util.List;

@FeignClient(value = "Medical", url = "http://localhost:8082/")
public interface Localhost8082 {
    @GetMapping(value = "/doctors")
    List<DoctorDTO> getDoctors();

    @GetMapping(value = "/patients")
    List<PatientDTO> getPatients();

    @GetMapping(value = "/facilities")
    List<FacilityDTO> getFacilities();
}
