package com.mybooksite.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.mybooksite.model.enums.Genre;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int tome;
	@Column
	private String title;
	@Column
	private String linkUrl;
	@Column
	private Genre genre;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAuthor",nullable=false)
	private Author idAuthor;

	public Book() {

	}

	public Book(int tome, String title, String linkUrl, Genre genre, Author idAuthor) {
		super();
		this.tome = tome;
		this.title = title;
		this.linkUrl = linkUrl;
		this.genre = genre;
		this.idAuthor = idAuthor;
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

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Author getAuthor() {
		return idAuthor;
	}

	public void setAuthor(Author idAuthor) {
		this.idAuthor = idAuthor;
	}

}
