package com.tracker;

import com.tracker.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class BugTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugTrackerApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(1L, "Shy",LocalDate.of(1996, Month.SEPTEMBER, 5),"shy@gmail.com", 25),
				new Student(2L, "DeShawn",LocalDate.of(1997, Month.FEBRUARY, 21),"shawnny@gmail.com", 37)
		);

	}
}
