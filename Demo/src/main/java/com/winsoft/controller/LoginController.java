package com.winsoft.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;  
import com.winsoft.model.*; 
import com.winsoft.dao.*;  
import com.winsoft.jdbc.*;

@Controller  
public class LoginController
{  
    @Autowired  
    UserDao userdao; //will inject dao from xml file  
    
    @RequestMapping(value="/")
    public String inserData(@ModelAttribute User user)
    {
      userdao.insertData(user);
     System.out.println("insert");
     return "redirect:/login";
    }
    
    /*

	@RequestMapping("/login")  
    public ModelAndView login(HttpServletRequest request,HttpServletResponse res)
	{  
		
        String username=request.getParameter("username");  
        String password=request.getParameter("password");  
     
 
        
        
        
        
          DriverManagerDataSource dataSource = new DriverManagerDataSource();
		  dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		  dataSource.setUrl("jdbc:oracle:thin:@192.9.200.101:1521/winsoftorcldb");
		  dataSource.setUsername("intern_db");
		  dataSource.setPassword("winsoft");
		  JdbcTemplate jt=new JdbcTemplate(dataSource);
       
       System.out.println("database connected");
       
       String sql = ("select count(*) from LOGIN where USERNAME= ? and PASSWORD=?"); 
       
	int count = jt.queryForObject( sql, new Object[] { username,password} , Integer.class);
		

		

        	if(count>=1)
        	{
        		String message="hello"+username;
        		
        		return new ModelAndView("home","message",message);
        	}
        	else
        	{
        		String message="wrong username and password";
        		
        		return new ModelAndView("error","message",message);
        	}
        	 
        } 
	@RequestMapping("/")  
			public ModelAndView home(HttpServletRequest request,HttpServletResponse res)
	    	{  
	          
        		return new ModelAndView("login");
        		
        		}
    */
    
  }  