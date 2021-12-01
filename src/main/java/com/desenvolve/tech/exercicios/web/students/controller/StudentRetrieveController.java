package com.desenvolve.tech.exercicios.web.students.controller;

import com.desenvolve.tech.exercicios.web.students.entity.Student;
import com.desenvolve.tech.exercicios.web.students.service.StudentRegistration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentRetrieveController {

    @GetMapping("/student/allstudent")
    public List<Student> getAllStudents() {
        return StudentRegistration.getInstance().getStudentRecords();
    }

}
