package com.peyman.spring5webapp.repositories;

import com.peyman.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Peyman on 12/10/2017.
 */

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
