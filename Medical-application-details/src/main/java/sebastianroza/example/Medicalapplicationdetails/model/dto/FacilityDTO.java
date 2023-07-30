package sebastianroza.example.Medicalapplicationdetails.model.dto;

import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class FacilityDTO {
    private Long id;
    private String name;
    private String city;
    private String zipCode;
    private String streetName;
    private String streetNumber;
    private List<Long> doctorsId;
}
