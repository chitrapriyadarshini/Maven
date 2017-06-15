package test.com.revature.dao;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.dao.BookSalesDAO;
@Repository
public class TestBookSalesDAO {
	@Autowired
	public static void main(String[] args) {
		
		LocalDate searchDate = LocalDate.parse("2017-06-06");
		
		BookSalesDAO bookSalesDAO = new BookSalesDAO();
		
		/* Author can able to view- how many books sold */
		/* Weekly */
		try {
			bookSalesDAO.bookSalesWeekly(searchDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Author can able to view- how many books sold */
		/* Monthly */
		try {
			bookSalesDAO.bookSalesMonthly(searchDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Author can able to view- how many books sold */
		/* Yearly */
		try {
			bookSalesDAO.bookSalesYearly(searchDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
