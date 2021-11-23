package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
      Student marium = new Student(
          1L, "marium", "marium@gmail.com", LocalDate.of(2000, Month.APRIL, 14)
      );

      Student alex = new Student("alex", "alex@gmail.com", LocalDate.of(2005, Month.APRIL, 14)
      );

      repository.saveAll(
        List.of(marium, alex)
      );
    };
  }
}
