package com.winsoft.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.winsoft.model.*;  
  
import java.util.ArrayList;
import java.util.List;


import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import com.winsoft.model.*;
import com.winsoft.controller.*;
import com.winsoft.jdbc.*;

public class UserDaoImpl implements UserDao
{

	@Autowired
	DataSource dataSource;
	
	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertData(User user) 
	{
		/*
		System.out.println("helloo");
		  String sql = "INSERT INTO user1 "
		    + "(name,email,username,password,contact) VALUES (?, ?, ?,?,?)";


		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(sql,new Object[] {user.getId(), user.getName(), user.getEmail(),
				user.getUserName(), user.getPasssword(),user.getContact() });
*/
		
	}
}