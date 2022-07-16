package com.example.StudentManage.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.StudentManage.Entity.Student;
import com.example.StudentManage.Repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public Student saveStudent(Student student){
        return  repo.save(student);
    }

    public List<Student> saveStudent(List<Student> students){
        return  repo.saveAll(students);
    }

    public List<Student> getStudents(){
        return repo.findAll();
    }

    public Student getStudentById(int id ){
        return repo.findById(id).orElse(null);
    }

    public String deleteStudent(int id){
        repo.deleteById(id);
        return "Student removed " + id;
    }

    public Student updateStudent(Student student){
        Student existingStudent = repo.findById(student.getId()).orElse(null);
        existingStudent.setStudentname(student.getStudentname());
        existingStudent.setCourse(student.getCourse());
        existingStudent.setFee(student.getFee());
        return repo.save(existingStudent);
    }
}
