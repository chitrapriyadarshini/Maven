package com.revature.dao;

import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.revature.model.BookRatings;
import com.revature.util.ConnectionUtil;
@Repository
public class BookRatingsDAO {
	private static final org.jboss.logging.Logger LOGGER = LoggerFactory.logger(UserDAO.class);
	/* Users can provide ratings for the book */
	@Autowired
	public void addRating(BookRatings bookRatings) throws Exception {
		// Step 1:Get the connection
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        
        // Step 2: Query
		String sql = "update bookRatings set rating = ? where isbn = ?";
		
		// 3. Set the input and Query execute
		int rows = jdbcTemplate.update(sql, bookRatings.getRating(), bookRatings.getIsbn());
		System.out.println("No of rows updated : " + rows);
	}
	public static org.jboss.logging.Logger getLogger() {
		return LOGGER;
	}
}
