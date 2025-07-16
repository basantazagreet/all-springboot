package com.telusko.SpringJDBCDemo.service;

import com.telusko.SpringJDBCDemo.model.Student;
import com.telusko.SpringJDBCDemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void save(Student obj) {
        repo.save(obj);

    }

    public List<Student> getStudents(){
        return repo.findAll();
    }
}
