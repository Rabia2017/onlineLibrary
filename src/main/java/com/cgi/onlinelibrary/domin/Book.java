package com.cgi.onlinelibrary.domin;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by rabia on 06/07/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Document
public class Book implements Serializable{

    @Id
    String isbn;
    String title;

    //@DBRef
    //BookAuthor bookAuthor;

    //@DBRef
   // Publication publication;
}
