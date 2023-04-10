package com.example.JPA.PART2;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.example.JPA.PART2.TablePerClassInheritenceMapping")
@ComponentScan("com.example.JPA.PART2.ComponentMapping")
@SpringBootApplication

public class JpaPart2Application {









	public static void main(String[] args) {
		SpringApplication.run(JpaPart2Application.class, args);




	}

}
