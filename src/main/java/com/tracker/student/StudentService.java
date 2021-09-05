package com.tracker.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Shy", LocalDate.of(1996, Month.SEPTEMBER, 5),"shy@gmail.com", 25),
                new Student(2L, "DeShawn",LocalDate.of(1997, Month.FEBRUARY, 21),"shawnny@gmail.com", 37)
        );
    }

}
