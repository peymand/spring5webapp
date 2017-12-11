package com.peyman.spring5webapp.repositories;

import com.peyman.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Peyman on 12/10/2017.
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
