package com.marchapr.LMSkunalsir.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentResponseUpdateEmailDTO {
    private int id;

    private String name;
    private String email;
}
