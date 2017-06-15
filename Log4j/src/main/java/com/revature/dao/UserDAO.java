package com.revature.dao;

import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.revature.model.User;
import com.revature.util.ConnectionUtil;

@Repository
public class UserDAO {
	private static final Logger LOGGER = (Logger) LoggerFactory.logger(UserDAO.class);
	/* New User Can Register */
	@Autowired
	public void insertUser(User user) throws Exception {
		LOGGER.info("Entering findAll()");
        // 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
 
        // 2. Query
        String sql = "insert into book (id , name, username , password ,mobile_no , email_ID , active, role_ID) values (?,?,?,?,?,?,?,?)";
 
        // 3. Set the input and Query execute
        int rows = jdbcTemplate.update(sql, user.getId(), user.getName(), user.getUserName(), user.getPassword(), user.getMobileNumber(), user.getEmailID(), user.getActive(), user.getRoleId());
        System.out.println("No of rows inserted: " + rows);	
        LOGGER.info("List of users retrieval success");
    }
	
	/* User must be able to Login */
	public void loginUser(User user) throws Exception {
		// 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
		
        // 2. Query
        String sql = "update user set active = 'A' where (userName= ?) and (password = ?)";
		
        // 3. Set the input and Query execute
        int rows = jdbcTemplate.update(sql, user.getUserName(), user.getPassword());
       LOGGER.info("No of rows inserted: " + rows);
        if(rows == 1)
		LOGGER.info("Login Sucess");
	}
	
	/* User must be able to Reset Password */
	public void updatePassword(User user, String newPassword) throws Exception {
		try{
		// 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
		
        // 2. Query
		String sql = "update user set password = ? where ((username = ?) and (active = 'A')) and password=?";
		
		// 3. Set the input and Query execute
		int rows = jdbcTemplate.update(sql, newPassword, user.getUserName(), user.getPassword());
		LOGGER.info("No of rows inserted - {}", rows);
		if (rows == 1) 	
			LOGGER.info("Password Reset Sucess");
		else if (rows == 0) 
			LOGGER.info("Please Login to reset");
		else 
			LOGGER.info("Error Reset");
		LOGGER.info("No of rows inserted - {}", rows);
		}
		catch(Exception e)
		{LOGGER.error("unable to save user");
			}
		}

	public static Logger getLogger() {
		return LOGGER;
	}
}
