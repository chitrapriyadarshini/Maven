package com.revature.dao;

import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.revature.model.Book;
import com.revature.util.ConnectionUtil;
@Repository
public class BookSearchDAO {
	private static final org.jboss.logging.Logger LOGGER = LoggerFactory.logger(UserDAO.class);

	/* List all books */
	@Autowired
	public void ViewAllBooks() throws Exception {
		
		// 1. Get the connection
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
 
        // 2. Query
		String sql = "select * from book";
		
		// 3. Set the input and Query execute
		List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
		LOGGER.info(books);
	}
	
	/* Search by title */
	public void searchByTitle(Book book) throws Exception {
		
		// 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
		
        // 2. Query
        String sql = "select * from book where title=?";
		
        // 3. Set the input and Query execute
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class), book.getTitle());
		LOGGER.info(books);
	}
	
	/* Search by Author */
	public void searchByAuthor(Book book) throws Exception {
		
		// 1. Get the connection
				JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
				
		        // 2. Query
		        String sql = "select * from book where author=?";
				
		        // 3. Set the input and Query execute
		        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class), book.getAuthor());
				LOGGER.info(books);
	}
	
	/* Search by price range */
		
	public void searchByPrice(double minPrice, double maxPrice) throws Exception {
		// 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
			
	    // 2. Query
		String sql = "select * from book where price between ? and ?";
				
        // 3. Set the input and Query execute
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class), minPrice, maxPrice);
		LOGGER.info(books);
	}

	/* Search by Isbn */
	public void searchByIsbn(Book book) throws Exception {
		
		// 1. Get the connection
				JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
				
		        // 2. Query
		        String sql = "select * from book where isbn=?";
				
		        // 3. Set the input and Query execute
		        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class), book.getIsbn());
				LOGGER.info(books);
	}

	public static org.jboss.logging.Logger getLogger() {
		return LOGGER;
	}
}