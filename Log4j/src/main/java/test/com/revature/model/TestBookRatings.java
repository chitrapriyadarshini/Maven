package test.com.revature.model;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.dao.UserDAO;
import com.revature.model.BookRatings;
@Repository
public class TestBookRatings {
	@Autowired
	private static final org.jboss.logging.Logger LOGGER = LoggerFactory.logger(UserDAO.class);

	public static void main(String[] args) {
		
		BookRatings bookratings1 = new BookRatings();
		bookratings1.setIsbn(9788700631625l);
		bookratings1.setUserID(101);
		bookratings1.setRating(4.5);
		
		LOGGER.info("ISBN = " + bookratings1.getIsbn());
		LOGGER.info("User ID = " + bookratings1.getUserID());
	LOGGER.info("Ratings = " + bookratings1.getRating());
	}

	public static org.jboss.logging.Logger getLogger() {
		return LOGGER;
	}
}
