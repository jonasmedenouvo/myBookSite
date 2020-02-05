package com.mybooksite.mybooksite.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "saga", schema = "myBooksite")
public class Saga implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "saga_name")
    private String title;
    

    public Saga() {
    }

    public Saga(int id, String title) {
		super();
		this.id = id;
		this.title = title;
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

 
}
