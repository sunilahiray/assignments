<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Management</title>
</head>
<body>
<form name="submitForm" method="get" action="login">
        <div align="center">
            <table>
                <tr>
	                    <td>User Name:</td>
                    <td><input type="text" name="userName" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Login" />
                    
                   <input type="reset" value="Reset" /></td>
                </tr>
                <td><center>
						<a href="register.jsp">New Student</a>
					</center>
					</td>
            </table>
            
    </form>
</body>
</html>