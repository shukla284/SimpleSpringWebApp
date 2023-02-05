package com.springwebapp.SpringWebApp.repositories;

import com.springwebapp.SpringWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
