package test.com.revature.model;

import java.time.LocalDate;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.dao.UserDAO;
import com.revature.model.Book;
@Repository
public class TestBook {
	@Autowired
	private static final org.jboss.logging.Logger LOGGER = LoggerFactory.logger(UserDAO.class);

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setIsbn(9788700631625l);
		book1.setTitle("Harry potter");
		book1.setAuthor("JK rowling");
		book1.setPublishDate(LocalDate.parse("1990-12-01"));
		book1.setContent("Harry potter is an novel collection of wizards and witches in hogwards school");
		book1.setPrice(1200);
		book1.setStatus("published");
		
		LOGGER.info(book1.toString());
	}
}
