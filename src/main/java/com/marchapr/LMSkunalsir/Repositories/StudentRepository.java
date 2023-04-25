package com.marchapr.LMSkunalsir.Repositories;

import com.marchapr.LMSkunalsir.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
