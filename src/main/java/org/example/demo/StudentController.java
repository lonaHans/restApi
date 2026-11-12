package org.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    public List<Student> students = List.of(
            new Student(
                    1,
                    "Lona",
                    "Hans",
                    "lona@gmail.com",
                    "Computer Science"
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

    @GetMapping
    public List<Student> getAllStudents(){

        return students;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentWithId(@PathVariable int id){
        for(Student s : students){
            if(s.id() == id){
                return ResponseEntity.ok(s);
            }

        }

        return ResponseEntity.status(404)
                .body("Student not found");

    }




}
