/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Cliftonb
 */
public class BookManager {

	public static String getBook() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("books.txt")).useDelimiter("#");
		String author = sc.next();
		String genre = sc.next();
		String title = sc.next();
		int numPages = sc.nextInt();

		Book b = new Book(author, genre, title, numPages);
		return b.toString();
	}

	public static void setBook(String author, String genre, String title, int numPages) throws IOException {
		Book b = new Book(author, genre, title, numPages);

		PrintWriter pw = new PrintWriter(new FileWriter("books.txt", false));
		pw.println(b.toFileString());
		pw.close();
	}
}
