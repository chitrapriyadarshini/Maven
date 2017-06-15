package test.com.revature.model;

import java.time.LocalDate;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.dao.UserDAO;
import com.revature.model.BookSales;
@Repository
public class TestBookSales {
	private static final org.jboss.logging.Logger LOGGER = LoggerFactory.logger(UserDAO.class);

	@Autowired
	public static void main(String[] args) {
		BookSales bookSales1 = new BookSales();
		
		bookSales1.setSalesID(1001);
		bookSales1.setUserID(101);
		bookSales1.setIsbn(9788700631625l);
		bookSales1.setQuantity(3);
		bookSales1.setPrice(250.00);
		bookSales1.setTotalAmount(bookSales1.getPrice() * bookSales1.getQuantity());
		bookSales1.setOrderDate(LocalDate.parse("2017-06-06"));
		bookSales1.setStatus("Shipped");
		
		LOGGER.info("Sales ID = " + bookSales1.getSalesID());
		LOGGER.info("User ID = " + bookSales1.getUserID());
		LOGGER.info("ISBN = " + bookSales1.getIsbn());
		LOGGER.info("Quantity = " + bookSales1.getQuantity());
		LOGGER.info("Price = " + bookSales1.getPrice());
		LOGGER.info("Total Amount = " + bookSales1.getTotalAmount());
		LOGGER.info("Order Date = " + bookSales1.getOrderDate());
		LOGGER.info("Status = " + bookSales1.getStatus());
	}
}
