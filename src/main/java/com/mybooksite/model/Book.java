package com.mybooksite.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.mybooksite.model.enums.Genre;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	@NotNull
	private String title;
	@Column
	@NotNull
	private String linkUrl;
	@Column
	@NotNull
	private Genre genre;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAuthor",nullable=false)
	private Author idAuthor;

	public Book() {

	}

	public Book(int id, @NotNull String title, @NotNull String linkUrl, @NotNull Genre genre, Author idAuthor) {
		super();
		this.id = id;
		this.title = title;
		this.linkUrl = linkUrl;
		this.genre = genre;
		this.idAuthor = idAuthor;
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

	public Author getIdAuthor() {
		return idAuthor;
	}

	public void setIdAuthor(Author idAuthor) {
		this.idAuthor = idAuthor;
	}

	

}
