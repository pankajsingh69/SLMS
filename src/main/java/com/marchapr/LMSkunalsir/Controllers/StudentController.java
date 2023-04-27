package com.marchapr.LMSkunalsir.Controllers;

import com.marchapr.LMSkunalsir.DTO.StudentRequestDTO;
import com.marchapr.LMSkunalsir.DTO.StudentRequestUpdateEmailDTO;
import com.marchapr.LMSkunalsir.DTO.StudentResponseUpdateEmailDTO;
import com.marchapr.LMSkunalsir.Models.Student;
import com.marchapr.LMSkunalsir.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public String addStudent(@RequestBody StudentRequestDTO studentRequestDTO){
        studentService.addStudent(studentRequestDTO);
        return "Student added successfully";
    }

//    find students by email and age
    @GetMapping("/findStudentByEmail")
    public String findStudentByEmail(@RequestParam("email") String email) throws Exception {
      return  studentService.findStudentByEmail(email);
    }

//    @GetMapping("/findStudentByAge")
//    public List<Student> findStudentByAge(@RequestParam("age") int age){
//        return studentService.
//    }


//    update the email of student using DTO
    @PutMapping("/updateEmail")
    public StudentResponseUpdateEmailDTO updateEmail(@RequestBody StudentRequestUpdateEmailDTO studentRequestUpdateEmailDTO){
        return studentService.updateEmailDTO(studentRequestUpdateEmailDTO);
    }

}
