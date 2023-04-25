package com.marchapr.LMSkunalsir.Services;

import com.marchapr.LMSkunalsir.Enums.CardStatus;
import com.marchapr.LMSkunalsir.Models.LibraryCard;
import com.marchapr.LMSkunalsir.Models.Student;
import com.marchapr.LMSkunalsir.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


        @Autowired
        StudentRepository studentRepository;
        public void addStudent(Student student){

            //set card values
            LibraryCard card = new LibraryCard();
            card.setCardStatus(CardStatus.ACTIVATED);
            card.setVaildTill("12/12/2025");
            card.setStudent(student);
            //set student values
            student.setLibraryCard(card);

            studentRepository.save(student);  // this will save for card as well because we use CascadeType.ALL
        }


    }

