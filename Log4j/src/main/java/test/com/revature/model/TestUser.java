package test.com.revature.model;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.dao.UserDAO;
import com.revature.model.User;
@Repository
public class TestUser {
	private static final org.jboss.logging.Logger LOGGER = LoggerFactory.logger(UserDAO.class);

	@Autowired
	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(101);
		user1.setName("Sharan");
		user1.setUserName("sharan7797");
		user1.setPassword("sharan123");
		user1.setMobileNumber(9876549876l);
		user1.setEmailID("sharan@gmail.com");
		user1.setActive("A");
		user1.setRoleId(100);
		
		LOGGER.info("ID = " + user1.getId());
		LOGGER.info("Name = " + user1.getName());
		LOGGER.info("UserName = " + user1.getUserName());
		LOGGER.info("Password = " + user1.getPassword());
		LOGGER.info("Mobile Number = " + user1.getMobileNumber());
		LOGGER.info("Email ID = " + user1.getEmailID());
		LOGGER.info("Active = " + user1.getActive());
		LOGGER.info("Role ID = " + user1.getRoleId());
		
	}
}
