package com.anthology.student.ui.controller;

import com.anthology.student.ui.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentUIController {

    @GetMapping("/students")
    public String showStudentsPage() {
        return "students"; // Points to students.html in the templates folder
    }
}