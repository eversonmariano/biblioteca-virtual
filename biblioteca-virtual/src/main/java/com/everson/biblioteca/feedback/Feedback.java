package com.everson.biblioteca.feedback;

import com.everson.biblioteca.book.Book;
import com.everson.biblioteca.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Feedback extends BaseEntity {

   private Double note;
   private String comment;

   @ManyToOne
   @JoinColumn(name = "book_id")
   private Book book;

}
