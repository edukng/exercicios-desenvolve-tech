package com.desenvolve.tech.exercicios.web.students.controller;

import com.desenvolve.tech.exercicios.web.students.entity.Student;
import com.desenvolve.tech.exercicios.web.students.service.StudentRegistration;
import com.desenvolve.tech.exercicios.web.students.service.StudentRegistrationReply;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRegistrationController {


    @PostMapping("/register/student")
    public StudentRegistrationReply registerStudent(@RequestBody Student student) {
        System.out.println("In registerStudent");
        StudentRegistrationReply stdregreply = new StudentRegistrationReply();
        StudentRegistration.getInstance().add(student);
        //We are setting the below value just to reply a message back to the caller
        stdregreply.setName(student.getName());
        stdregreply.setAge(student.getAge());
        stdregreply.setRegistrationNumber(student.getRegistrationNumber());
        stdregreply.setRegistrationStatus("Successful");

        return stdregreply;
    }
}