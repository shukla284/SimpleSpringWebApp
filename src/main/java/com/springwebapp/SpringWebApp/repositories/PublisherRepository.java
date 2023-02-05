package com.springwebapp.SpringWebApp.repositories;

import com.springwebapp.SpringWebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
