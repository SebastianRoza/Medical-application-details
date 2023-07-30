package sebastianroza.example.Medicalapplicationdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MedicalApplicationDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalApplicationDetailsApplication.class, args);
	}

}
