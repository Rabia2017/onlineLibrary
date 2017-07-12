package com.cgi.onlinelibrary.repository;

import com.cgi.onlinelibrary.domin.Publication;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rabia on 06/07/17.
 */
@Repository
public interface PublicationRepository extends MongoRepository<Publication,Integer> {
}
