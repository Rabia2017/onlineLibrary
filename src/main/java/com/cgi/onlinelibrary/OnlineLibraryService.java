package com.cgi.onlinelibrary;

import com.cgi.onlinelibrary.domin.Book;
import com.cgi.onlinelibrary.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.*;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


/**
 * Created by rabia on 06/07/17.
 */
@Slf4j
@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.cgi.onlinelibrary.repository")
public class OnlineLibraryService implements CommandLineRunner{

    @Autowired
    private BookRepository br ;
    public static void main (String[] args){
        System.setProperty("spring.config.name", "onlineLibrary.yml");
        SpringApplication.run(OnlineLibraryService.class,args);
    }

    public void run(String... args) throws Exception{
        br.deleteAll();

        for (int i=0;i<=22;i++) {
            Book bk = new Book("bkisb"+ i,"Java");
            br.save(bk);
        }

        log.info("# of books in Book Doc " +br.findAll().size());

        Page bookPage = br.findByTitle("Java", new PageRequest(4,5));
        log.info("******************************************"+ bookPage.getTotalPages());
        log.info("******************************************"+ bookPage.getNumberOfElements());
    }
}
