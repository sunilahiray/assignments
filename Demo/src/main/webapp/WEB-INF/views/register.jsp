<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Registration</title>
</head>
<body>     
         <form:form  method="get" action="/insert" modelAttribute="user">
    
       
         <tr>    
          <td>Name : </td>   
          <td><input type="text" name="name" ></td>  
         </tr>    
         <tr>    
          <td>Email :</td>    
          <td><input type="text" name="email" ></td>  
         </tr>  
          <tr>    
          <td>UserName :</td>    
          <td><input type="text" name="username" ></td>  
         </tr>  
          <tr>    
          <td>Password :</td>    
          <td><input type="text" name="password" ></td>  
         </tr>  
         <tr>    
          <td>Contact :</td>    
          <td><input type="text" name="contact" ></td>  
         </tr>   
         
         <tr>    
          <td> </td>    
          <td><input type="submit" value="register" /></td>    
         </tr>    
        </table>    
       </form:form>    
</body>
</html>
