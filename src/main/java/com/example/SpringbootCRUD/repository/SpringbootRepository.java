package com.example.SpringbootCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringbootCRUD.domain.Student;

@Repository
public interface SpringbootRepository extends JpaRepository<Student, Long> {

}
