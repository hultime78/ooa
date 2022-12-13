package org.hlab.bookapirest.controller;

import org.hlab.bookapirest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("listStudent",studentService.getStudents());
        return "index";
    }
}
