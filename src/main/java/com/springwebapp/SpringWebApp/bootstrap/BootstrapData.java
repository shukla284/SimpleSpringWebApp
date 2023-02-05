package com.springwebapp.SpringWebApp.bootstrap;


import com.springwebapp.SpringWebApp.domain.Author;
import com.springwebapp.SpringWebApp.domain.Book;
import com.springwebapp.SpringWebApp.repositories.AuthorRepository;
import com.springwebapp.SpringWebApp.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@AllArgsConstructor
@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        Author author = Author.builder().firstName("John").lastName("Doe").bookSet(new HashSet<>()).build();
        Book book = Book.builder().title("Sample Book").isbn("SAMPLE").authors(new HashSet<>()).build();

        author.getBookSet().add(book);
        book.getAuthors().add(author);

        authorRepository.save(author);
        bookRepository.save(book);

        System.out.println("Saved Books & Authors");
        System.out.printf("Books " + bookRepository.count() + " Authors: " + authorRepository.count());
    }
}
