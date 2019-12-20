package com.mybooksite.mybooksite.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Saga extends Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int tome;
    @Column(name = "saga_name")
    private String title;
    @Column(name = "link_Url")
    private String link_Url;
    @Column(name = "author")
    private int author;
    @Column(name = "saga")
    private int saga;
}
