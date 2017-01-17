package com.winsoft.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.winsoft.dao.*;
import com.winsoft.model.*;;


public class UserServicesImpl implements UserServices
{

 @Autowired
 UserDao userdao;

 @Override
 public void insertData(User user)
 {
  userdao.insertData(user);
 }

 
}
