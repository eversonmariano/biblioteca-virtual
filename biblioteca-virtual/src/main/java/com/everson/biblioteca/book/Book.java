package com.everson.biblioteca.book;

import com.everson.biblioteca.common.BaseEntity;
import com.everson.biblioteca.feedback.Feedback;
import com.everson.biblioteca.history.BookTransactionHistory;
import com.everson.biblioteca.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Book extends BaseEntity {


    private String title;
    private String authorName;
    private String isbn;
    private String synopsis;
    private String bookCover;
    private boolean archived;
    private boolean shareable;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @OneToMany(mappedBy = "book")
    private List<Feedback> feedbacks;

    @OneToMany(mappedBy = "book")
    private List<BookTransactionHistory> histories;

    @Transient
    public double getRate(){
        if(feedbacks == null || feedbacks.isEmpty()) {
            return 0;
        }
        var rate = this.feedbacks.stream().mapToDouble(Feedback::getNote).average().orElse(0.0);
        return Math.round(rate * 10) / 10.0;
    }

}
