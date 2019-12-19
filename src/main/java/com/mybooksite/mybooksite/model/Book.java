package com.mybooksite.mybooksite.model;


import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book", schema = "myBooksite")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int tome;
    @Column(name = "title")
    private String title;
    @Column(name = "link_Url")
    private String link_Url;
    @Column(name = "author")
    private int author;
    @Column(name = "saga")
    private int saga;


}
