package com.example.SpringbootCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringbootCRUD.domain.Student;
import com.example.SpringbootCRUD.repository.SpringbootRepository;

@Service
public class SpringbootService {

    @Autowired
    private SpringbootRepository repo;

    public List<Student> listAll() {
        return repo.findAll();
    }

    public void save(Student std) {
        repo.save(std);
    }

    public Student get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
