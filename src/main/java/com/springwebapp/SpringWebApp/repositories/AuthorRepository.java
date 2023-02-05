package com.springwebapp.SpringWebApp.repositories;

import com.springwebapp.SpringWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
