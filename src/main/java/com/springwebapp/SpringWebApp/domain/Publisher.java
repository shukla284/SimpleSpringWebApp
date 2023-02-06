package com.springwebapp.SpringWebApp.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.Set;

@Getter @Setter @Builder @ToString
@Entity @NoArgsConstructor @AllArgsConstructor
public class Publisher {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String address;


    /**
     *
     * One book does have a sigle publisher, while a publisher can publish several books.
     * When we are defining the book-publisher relation then for a single publisher we can have all of the required books.
     * The parameter here is books which can be extracted using that, while the inverse relation is for book which is single publisher.
     * Publisher ID is stored for the table instead of anything else.
     */
    @OneToMany @JoinColumn(name = "publisher_id")
    Set<Book> books;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return Objects.equals(id, publisher.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }
}
