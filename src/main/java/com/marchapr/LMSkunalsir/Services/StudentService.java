package com.marchapr.LMSkunalsir.Services;

import com.marchapr.LMSkunalsir.DTO.StudentRequestDTO;
import com.marchapr.LMSkunalsir.DTO.StudentRequestUpdateEmailDTO;
import com.marchapr.LMSkunalsir.DTO.StudentResponseUpdateEmailDTO;
import com.marchapr.LMSkunalsir.Enums.CardStatus;
import com.marchapr.LMSkunalsir.Models.LibraryCard;
import com.marchapr.LMSkunalsir.Models.Student;
import com.marchapr.LMSkunalsir.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


        @Autowired
        StudentRepository studentRepository;
        public void addStudent(StudentRequestDTO studentRequestDTO){
            Student student = new Student();
            student.setEmail(studentRequestDTO.getEmail());
            student.setAge(studentRequestDTO.getAge());
            student.setName(studentRequestDTO.getName());
            student.setDepartment(studentRequestDTO.getDepartment());

            //create a card object
            LibraryCard card = new LibraryCard();
            card.setCardStatus(CardStatus.ACTIVATED);

            //set the student also
            student.setLibraryCard(card);

            studentRepository.save((student));

        }

        public String findStudentByEmail(String email) throws Exception{
            Student student;
            student = studentRepository.findByEmail(email);
            return student.getName();
        }

//        public List<String> findStudentByAge(int age){
//            List<String> studentnames;
//            List<Student> studentList;
//            studentList = studentRepository.findByAge(age);
//            for(Student x : studentList){
//
//            }
//        }

     public StudentResponseUpdateEmailDTO updateEmailDTO(StudentRequestUpdateEmailDTO studentRequestUpdateEmailDTO){
            Student student = studentRepository.findById(studentRequestUpdateEmailDTO.getId()).get();
            student.setEmail(studentRequestUpdateEmailDTO.getEmail());

            //updated data
            Student updatedstudent = studentRepository.save(student);
            // return should be of type StudentResponse...

         StudentResponseUpdateEmailDTO studentResponse = new StudentResponseUpdateEmailDTO();
         studentResponse.setId(updatedstudent.getId());
         studentResponse.setEmail(updatedstudent.getEmail());
         studentResponse.setName(updatedstudent.getName());

         return studentResponse;

     }
    }

