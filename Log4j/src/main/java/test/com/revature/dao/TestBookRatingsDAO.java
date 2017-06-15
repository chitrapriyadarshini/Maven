package test.com.revature.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.dao.BookRatingsDAO;
import com.revature.model.BookRatings;
@Repository
public class TestBookRatingsDAO {
	@Autowired
	public static void main(String[] args) {
		
		BookRatings bookratings = new BookRatings();
		bookratings.setIsbn(9788700631625l);
		bookratings.setUserID(101);
		bookratings.setRating(4.5);
		
		BookRatingsDAO bookRatingsDAO = new BookRatingsDAO();
		
		/* Users can provide ratings for the book */
		try {
			bookRatingsDAO.addRating(bookratings);
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
