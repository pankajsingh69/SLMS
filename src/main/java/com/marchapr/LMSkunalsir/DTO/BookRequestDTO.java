package com.marchapr.LMSkunalsir.DTO;

import com.marchapr.LMSkunalsir.Enums.Genre;
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
public class BookRequestDTO {
    private String title;
    private int price;
//    @Enumerated(value = EnumType.STRING)
    private Genre genre;

//    private boolean isIssued;   THIS WILL BY DEFAULT BE FALSE
    private int authorId;

}
