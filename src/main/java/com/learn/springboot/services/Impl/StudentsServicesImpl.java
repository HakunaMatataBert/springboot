package com.learn.springboot.services.Impl;


import com.learn.springboot.mapper.StudentsMapper;
import com.learn.springboot.model.Students;
import com.learn.springboot.services.StudentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentsServicesImpl implements StudentsServices {
    @Autowired
    private StudentsMapper studentsMapper;





    @Override
    public List<Students> getAllStudents() {
        return studentsMapper.getAllStudents();
    }
}
