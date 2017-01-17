package com.winsoft.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import com.winsoft.model.*;

public class UserExtractor implements ResultSetExtractor<User> {

 @Override
public User extractData(ResultSet resultSet) throws SQLException,DataAccessException 
 {
	 
  
  User user = new User();
  
  user.setId(resultSet.getInt(1));
  user.setName(resultSet.getString(2));
  user.setEmail(resultSet.getString(3));
  user.setUserName(resultSet.getString(4));
  user.setPassword(resultSet.getString(5));
  user.setContact(resultSet.getInt(6));
  return user;
 }
}
