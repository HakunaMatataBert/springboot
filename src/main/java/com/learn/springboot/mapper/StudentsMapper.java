package com.learn.springboot.mapper;

import com.learn.springboot.model.Students;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface StudentsMapper {
         List<Students> getAllStudents();
}
