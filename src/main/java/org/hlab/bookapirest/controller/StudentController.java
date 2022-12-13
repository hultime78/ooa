package org.hlab.bookapirest.controller;

import org.hlab.bookapirest.model.Student;
import org.hlab.bookapirest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("listStudent",studentService.getStudents());
        return "index";
    }

    @GetMapping("/addNewStudent")
    public String newStudentForm(Model model){
        Student student=new Student();
        model.addAttribute("student",student);
        return "newStudent";
    }
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute Student student){
        studentService.saveStudent(student);
        return "redirect:/";
    }
}
