package com.peyman.spring5webapp.bootstrap;

import com.peyman.spring5webapp.model.Author;
import com.peyman.spring5webapp.model.Book;
import com.peyman.spring5webapp.model.Publisher;
import com.peyman.spring5webapp.repositories.AuthorRepository;
import com.peyman.spring5webapp.repositories.BookRepository;
import com.peyman.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Peyman on 12/10/2017.
 */
@Component
public class Devbootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public Devbootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        //initData();
    }

    private void initData() {

        Publisher publisher = new Publisher();
        publisher.setName("foo");

        publisherRepository.save(publisher);

        Author eric = new Author("Eric","Evans");
        Book book = new Book("DDD","1234",publisher);
        eric.getBooks().add(book);
        book.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(book);

        Author rod = new Author("Rod","Johnson");
        Book noEjb = new Book("J2ee","2234",publisher);
        rod.getBooks().add(noEjb);
        noEjb.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepository.save(noEjb);

    }
}
