package org.hlab.bookapirest.controller;

import org.hlab.bookapirest.model.Student;
import org.hlab.bookapirest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "new_student";
    }
    @PostMapping("/saveStudent")
    public String saveStudentForm(@ModelAttribute Student student){
        studentService.saveStudent(student);
        return "redirect:/";
    }
    @GetMapping(value = "/updateStudent/{id}")
    public String updateStudentForm(@PathVariable(value ="id" )long id,Model model){
        Student student=studentService.findStudentById(id).get();
        model.addAttribute("student",student);
        return "update_student";
    }
}
