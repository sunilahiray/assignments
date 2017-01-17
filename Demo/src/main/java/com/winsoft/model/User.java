package com.winsoft.model;

public class User
{
	 private static final long serialVersionUID = 1L;
private int id;  
private String name;
private String email;
private String username;
private String password;
private int contact;  

public User() 
{
}

public User(int id,String name, String email, String username, String password,int contact) {
    this.id=id;
	this.name = name;
    this.email = email;
    this.username=username;
    this.password=password;
    this.contact=contact;
    
}
public int getId() 
{  
    return id;  
}  
public void setId(int id)
{  
    this.id = id;  
}  
public String getName()
{  
    return name;  
}  
public void setName(String name) 
{  
    this.name = name;  
}  
public String getEmail()
{  
    return email;  
}  
public void setEmail(String email) 
{  
    this.email = email;  
}  

public String getUserName()
{
	return username;
	
}
public void setUserName(String username)
{
	this.username=username;	
}

public String getPasssword()
{
	return password;
	
}
public void setPassword(String password)
{
	this.password=password;	
}

public int getContact()
{
	return contact;
	
}
public void setContact(int contact)
{
	this.contact=contact;	
}


}