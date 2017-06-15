package test.com.revature.model;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.dao.UserDAO;
import com.revature.model.BookInventory;
@Repository
public class TestBookInventory {
	@Autowired
	private static final org.jboss.logging.Logger LOGGER = LoggerFactory.logger(UserDAO.class);

	public static void main(String[] args) {
		
		BookInventory bookInventory1 = new BookInventory();
		bookInventory1.setIsbn(9788700631625l);
		bookInventory1.setQuantity(5);
		
		LOGGER.info("ISBN = " + bookInventory1.getIsbn());
	LOGGER.info("Quantity = " + bookInventory1.getQuantity());
	}

	public static org.jboss.logging.Logger getLogger() {
		return LOGGER;
	}

}
