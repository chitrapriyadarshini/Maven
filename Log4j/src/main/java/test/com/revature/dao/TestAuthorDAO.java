package test.com.revature.dao;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.dao.AuthorDAO;
import com.revature.model.Book;
@Repository
public class TestAuthorDAO {
	@Autowired
	public static void main(String[] args) {
		Book book = new Book();
		book.setIsbn(9788700631625l);
		book.setTitle("Harry potter");
		book.setAuthor("JK rowling");
		book.setPublishDate(LocalDate.parse("1990-12-01"));
		book.setContent("Harry potter is an novel collection of wizards and witches in hogwards school");
		book.setPrice(1200);
		book.setStatus("published");
		
		AuthorDAO author = new AuthorDAO();
		
		/* Author can create a book */
		try {
			author.insertBook(book);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		/* Author can upload the contents of book */
		try {
			author.updateContent(book);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		/* Author can view the book and contents */
		try {
			author.viewBook(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Author can delete the book */
		try {
			author.deleteBook(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Author can view all his books */
		try {
			author.viewAllBooks(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
