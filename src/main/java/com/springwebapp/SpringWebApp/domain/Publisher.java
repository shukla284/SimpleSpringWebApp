package com.springwebapp.SpringWebApp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Objects;

@Getter @Setter @Builder @ToString
@Entity @NoArgsConstructor @AllArgsConstructor
public class Publisher {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String address;

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
