package com.cgi.onlinelibrary.repository;

import com.cgi.onlinelibrary.domin.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rabia on 06/07/17.
 */
@Repository
public interface AuthorRepository extends PagingAndSortingRepository<Author,Integer> {
    @Query(value = "{'name':?0}")
    Page<Author> findAuthorByName (String name, Pageable pageable);

}
