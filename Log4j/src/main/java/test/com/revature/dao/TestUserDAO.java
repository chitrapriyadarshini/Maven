package test.com.revature.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.dao.UserDAO;
import com.revature.model.User;
@Repository
public class TestUserDAO {
	@Autowired
	public static void main(String[] args) {
		
		User user = new User();
		user.setId(101);
		user.setName("Sharan");
		user.setUserName("sharan7797");
		user.setPassword("sharan123");
		user.setMobileNumber(9876549876l);
		user.setEmailID("sharan@gmail.com");
		user.setActive("A");
		user.setRoleId(100);
		
		UserDAO userDAO = new UserDAO();
		
		/* New User Can Register */
		try {
			userDAO.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* User must be able to Login */
		try {
			userDAO.loginUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* User must be able to Reset Password */
		try {
			userDAO.updatePassword(user, "sharan789");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
