package com.cgi.onlinelibrary.repository;

import com.cgi.onlinelibrary.domin.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.*;
/**
 * Created by rabia on 06/07/17.
 */
@Repository
public interface BookRepository extends MongoRepository<Book,String>{
    @Query(value = "{'title':?0}")
    Page<Book> findByTitle (String title, Pageable pageable);
}
