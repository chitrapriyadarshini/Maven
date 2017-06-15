package test.com.revature.util;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.dao.UserDAO;
import com.revature.util.ConnectionUtil;
 
public class TestConnectionUtil {
	private static final org.jboss.logging.Logger LOGGER = LoggerFactory.logger(UserDAO.class);

	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
		LOGGER.info(jdbcTemplate);
	}	
}

