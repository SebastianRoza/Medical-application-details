package sebastianroza.example.Medicalapplicationdetails.model.dto;

import lombok.*;
import sebastianroza.example.Medicalapplicationdetails.model.Specialization;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class DoctorDTO {
    private Long id;
    private Specialization specialization;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private List<Long> facilitiesId;
}
