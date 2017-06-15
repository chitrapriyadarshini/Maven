package test.com.revature.dao;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.dao.BookSearchDAO;
import com.revature.model.Book;
@Repository
public class TestBookSearchDAO {
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
		
		BookSearchDAO bookSearchDAO = new BookSearchDAO();
		
		/* List all books */
		try {
			bookSearchDAO.ViewAllBooks();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Search by title */
		try {
			bookSearchDAO.searchByTitle(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Search by Author */
		try {
			bookSearchDAO.searchByAuthor(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Search by price range */
		try {
			bookSearchDAO.searchByPrice(250.00, 500.00);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Search by Isbn */
		try {
			bookSearchDAO.searchByIsbn(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
