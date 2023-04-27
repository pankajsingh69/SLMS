package com.marchapr.LMSkunalsir.Repositories;

import com.marchapr.LMSkunalsir.Models.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<LibraryCard,Integer> {

}
