package sebastianroza.example.Medicalapplicationdetails.model.entity;

import lombok.*;
import sebastianroza.example.Medicalapplicationdetails.model.dto.DoctorDTO;
import sebastianroza.example.Medicalapplicationdetails.model.dto.FacilityDTO;
import sebastianroza.example.Medicalapplicationdetails.model.dto.PatientDTO;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CombinedMedicalDetails {
    private List<DoctorDTO> doctorDTOs;
    private List<PatientDTO> patientDTOs;
    private List<FacilityDTO> facilityDTOS;
}
