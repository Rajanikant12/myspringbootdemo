package myspringbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
public class MyspringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringbootdemoApplication.class, args);
		System.out.println("Application started successfull yay !!!!");

		
	}
	@GetMapping("/")
	public String hello(){
		return "This is testing";
	}

}
