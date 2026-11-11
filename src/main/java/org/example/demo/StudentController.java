package org.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class StudentController {

    public List<Student> students = List.of(
            new Student(
                    1,"Lona","Hans","lona@gmail.com","Computer Science"
            ),
            new Student(
                    2,
                    "Cebisa",
                    "Mente",
                    "cebisa@gmail.com",
                    "Computer Science"
            ),
            new Student(
                    3,
                    "Me",
                    "Flower",
                    "me@gmail.com",
                    "IT"
            )
    );

    @GetMapping("api/v1/students")
    public List<Student> getAllStudents(){
        return students;
    }




}
