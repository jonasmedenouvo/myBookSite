package com.mybooksite.mybooksite.model;


import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "assassin_royal", schema = "myBooksite")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tome")
    private int tome;
    @Column(name = "title")
    private String title;
    @Column(name = "link_Url")
    private String link_Url;
    @Column(name = "author")
    private String author;

    public int getTome_number() {
        return tome;
    }

    public void setTome_number(int tome_number) {
        this.tome = tome_number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink_Url() {
        return link_Url;
    }

    public void setLink_Url(String link_Url) {
        this.link_Url = link_Url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
