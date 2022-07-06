package com.example.StudentManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.example.StudentManagement.Domain.Student;
 
 
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
 
}
