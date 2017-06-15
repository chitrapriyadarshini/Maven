package com.revature.controller;

	import java.io.IOException;
	import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.revature.dao.UserDAO;
	import com.revature.model.User;

	@WebServlet("/test")
	public class UserRegisterServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
		static final Logger LOGGER = Logger.getLogger(UserRegisterServlet.class);
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public UserRegisterServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			 LOGGER.info("This is a logging statement from log4j");
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
			
			User user = new User();
			UserDAO userDao = new UserDAO();
			
			user.setId(Integer.parseInt(request.getParameter("id")));
			user.setName(request.getParameter("name"));
			user.setUserName(request.getParameter("userName"));
			user.setPassword(request.getParameter("password"));
			user.setMobileNumber(Long.parseLong("mobileNumber"));
			user.setEmailID(request.getParameter("emailID"));
			user.setActive("A");
			user.setRoleId(Integer.parseInt(request.getParameter("roleID")));
			
			try {
				userDao.insertUser(user);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

