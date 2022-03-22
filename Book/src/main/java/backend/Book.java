/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author Cliftonb
 */
public class Book {

	private String author;
	private String genre;
	private String title;
	private int numPages;

	public Book(String author, String genre, String title, int numPages) {
		this.author = author;
		this.genre = genre;
		this.title = title;
		this.numPages = numPages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public String toFileString() {
		return author + "#" + genre + "#" + title + "#" + numPages + "#";
	}

	@Override
	public String toString() {
		return "Book{" + "\nauthor=" + author + "\ngenre=" + genre + "\ntitle=" + title + "\nnumPages=" + numPages + "\n}";
	}

}
