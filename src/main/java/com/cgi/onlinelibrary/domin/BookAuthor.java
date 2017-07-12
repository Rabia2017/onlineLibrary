package com.cgi.onlinelibrary.domin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by rabia on 07/07/17.
 */
@Data
@AllArgsConstructor
//@NoArgsConstructor
@EqualsAndHashCode

@Document
public class BookAuthor {
   // @DBRef
   // @Id
    //String Book;

    //@DBRef
    //@Id
    //int Author;
}
