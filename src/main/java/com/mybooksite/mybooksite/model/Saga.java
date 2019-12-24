package com.mybooksite.mybooksite.model;

import javax.persistence.*;

@Entity
@Table(name = "saga", schema = "myBooksite")
public class Saga {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "saga_name")
    private String title;
    @Column(name = "tome_Number")
    private int tome;
    @Column(name = "author")
    private int author;

    public Saga() {
    }
    public Saga(String title, int tome, int author) {
        this.title = title;
        this.tome = tome;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTome() {
        return tome;
    }

    public void setTome(int tome) {
        this.tome = tome;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }
}
