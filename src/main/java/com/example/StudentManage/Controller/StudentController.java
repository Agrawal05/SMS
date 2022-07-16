package com.example.StudentManage.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.example.StudentManage.Entity.Student;
import com.example.StudentManage.Service.StudentService;


@RestController
public class StudentController {
    @Autowired
    private StudentService service;

//    @GetMapping("/index")
//    public String viewHomePage(Model model) {
////        List<Student> liststudent = service.listAll();
////        model.addAttribute("liststudent", liststudent);
//        System.out.print("Get / ");
//        return "index";
//    }
//
//    @GetMapping("/Student")
//    public String getStudent(Student model) {
////        List<Student> liststudent = service.listAll();
////        model.addAttribute("liststudent", liststudent);
//        System.out.print("Get / ");
//        return "index";
//    }
//
//    @GetMapping("/new")
//    public String add(Model model) {
//        model.addAttribute("student", new Student());
//        return "new";
//    }
//
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String saveStudent(@ModelAttribute("student") Student std) {
//        service.save(std);
//        return "redirect:/";
//    }
//
//    @RequestMapping("/edit/{id}")
//    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
//        ModelAndView mav = new ModelAndView("new");
//        Student std = service.get(id);
//        mav.addObject("student", std);
//        return mav;
//    }
//
//    @RequestMapping("/delete/{id}")
//    public String deletestudent(@PathVariable(name = "id") int id) {
//        service.delete(id);
//        return "redirect:/";
//    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return service.saveStudent(students);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return service.getStudents();
    }

    @GetMapping("/student/{id}")
    public Student findByIdStudent(@PathVariable int id){
        return service.getStudentById(id );
    }

    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student){
         service.updateStudent(student);
         return service.saveStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        return service.deleteStudent(id);
    }
}
