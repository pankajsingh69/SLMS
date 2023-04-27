package com.marchapr.LMSkunalsir.DTO;

import com.marchapr.LMSkunalsir.Enums.Department;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequestDTO {
    private int age;
    private String name;
    private String email;
//    @Enumerated(value = EnumType.STRING)
    private Department department;
}
