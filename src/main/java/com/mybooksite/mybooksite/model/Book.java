package com.mybooksite.mybooksite.model;


import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book", schema = "myBooksite")
public class Book implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int tome;
    @Column(name = "title")
    private String title;
    @Column(name = "link_Url")
    private String linkUrl;
    @Column(name = "genre")
    private String genre;
    @Column(name = "author")
    private int author;
    @Column(name = "saga")
    private int saga;
	
    
    
    
    public Book() {
		
	}
	


	public Book(int tome, String title, String linkUrl, String genre, int author, int saga) {
		super();
		this.tome = tome;
		this.title = title;
		this.linkUrl = linkUrl;
		this.genre = genre;
		this.author = author;
		this.saga = saga;
	}	



	public int getTome() {
		return tome;
	}


	public void setTome(int tome) {
		this.tome = tome;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getLinkUrl() {
		return linkUrl;
	}


	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public int getAuthor() {
		return author;
	}


	public void setAuthor(int author) {
		this.author = author;
	}


	public int getSaga() {
		return saga;
	}


	public void setSaga(int saga) {
		this.saga = saga;
	}
    
	
    


}
