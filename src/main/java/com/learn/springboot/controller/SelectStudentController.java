package com.learn.springboot.controller;

import com.learn.springboot.model.Students;
import com.learn.springboot.services.StudentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class SelectStudentController {

    @Autowired
    private StudentsServices studentsServices;

    @RequestMapping("/get")
    public List<Students> getAllStudent(){
        System.out.println("sds>>>>>>>>>");
        System.out.println(studentsServices.getAllStudents().size());
        return studentsServices.getAllStudents();
    }
}
