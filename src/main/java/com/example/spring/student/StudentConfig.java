package com.example.spring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Belal = new Student(
                    "Belal",
                    "Belal@mail.test",
                    LocalDate.of(1997, Month.OCTOBER, 11)
            );
            Student Mali = new Student(
                    "Mali",
                    "Mali@outlook.test",
                    LocalDate.of(1996, Month.MARCH, 6)
                    );
            Student Amir = new Student(
                    "Amir",
                    "Amir@gmail.test",
                    LocalDate.of(1994, Month.AUGUST, 16)
                    );

            repository.saveAll(
                    List.of(Belal, Mali, Amir)
            );
        };
    }
}
