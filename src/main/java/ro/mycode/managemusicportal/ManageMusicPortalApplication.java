package ro.mycode.managemusicportal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.mycode.managemusicportal.service.SingerService;

@SpringBootApplication
public class ManageMusicPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageMusicPortalApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(SingerService singerService){
		return  args->{

			singerService.getAllSingers().forEach(System.out::println);

		};

	}
}
