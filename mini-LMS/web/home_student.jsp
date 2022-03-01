<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : home
    Created on : Apr 18, 2020, 12:29:50 AM
    Author     : source
--%>
<%@page import="model.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import ="java.sql.*" %>
<%@page import=" java.io.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html> 
<html>
<head>
    <title>Project Home</title>
    <meta charset="utf-8" >
    <meta name="viewport" content="width=device-width , initial-scaler=1.0 , shrink-to-fit=no " >
   
        <link rel="stylesheet" href="css/bootstrap.min.css">
         <link rel="stylesheet" type="text/css" href="css/school.css" >
    
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
  
    </head>
    <style>
.home {
    
    height: 100vh;
    background-image: linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.3)), url(home.png);
    background-size:100%;
    background-repeat: no-repeat;
}
nav{
    float: right;
    margin-right: 50px;
}
.logo p{
    position: fixed;
    float: left;
    margin-left: 20px;
    color: #fff;
    font-weight: bold;
    font-size: 24px;
}
.logo2 p{
    position: fixed;
    text-align: center;
    margin-top: 100px;
    margin-left: 450px;
    color: #fff;
    font-weight: bold;
    font-size: 35px;
}

ul{
    margin: 0;
    padding: 0;
    list-style: none;
}
ul li{
    float: left ;
    color :white;
    width: 200px;
    height: 40px;
    background:  linear-gradient(rgba(0,0,0,0.9),rgba(0,0,0,0.9));
    opacity: 0.8;
    line-height: 40px;
    text-align: center;
    font-size: 20px;
    margin-right: 2px;
}
ul li a {
    text-decoration:none;
    color: white;
   display: block;
}
ul li a:hover{
    background-color:#736eaa;
}
ul li ul li {
    display: none;
}

ul li:hover ul li {
    display: block;
}
.course{
    position: fixed;
    text-align: center;
    margin-top: 230px;
    margin-left: 450px;
    color: wheat;
    font-size: 24px;
}
table {
    background:  linear-gradient(rgba(0,0,0,0.6),rgba(0,0,0,0.6));

}

</style>

 <body>

     <div class="home"> 
         <div class="logo"><p>OOP Coursera</p></div>
         <div class="logo2"><p>Welcome to OOP Coursera</p></div>
    <nav>
                 
       <ul>
        <li><a href="#">Courses</a></li>
             <li><a>Profile</a>
            <ul>
            
                <li><a href="http://localhost:8080/coursera_project/view_profile_student.jsp">View Profile</a></li>
                <li><a href="http://localhost:8080/coursera_project/edit_profile.jsp">Edit Profile</a></li>
          
            </ul>
        </li>

        <li><a href="http://localhost:8080/coursera_project/view_announcement.jsp">Announcements</a></li>
        <li><a href="http://localhost:8080/coursera_project/view_feedback.jsp">Feedbacks</a></li>
   
        </ul> 

    </nav>
        
    <div class="course">
         <h2 align="center" color="white"><font><strong>Your Courser</strong></font></h2>
<table align="center" cellpadding="3" cellspacing="5" border="1" >

<tr color="white">
<td><b>Course code</b></td>
<td><b>Course name</b></td>

</tr>

<%
try{
DB db=new DB();
user u = new student();
Connection connection=db.getConnection();
ResultSet resultSet = db.selectRS("student_course");
while(resultSet.next()){
if(resultSet.getInt("student_id")==u.getId())
{
    String course_name = db.selectString("course", "course_code",resultSet.getString("course_code"), "course_name");
%>
<tr>
<td width="350px" color="white"><%=resultSet.getString("course_code") %></td>
<td width="350px" color="white"><%=course_name%></td>

</tr>
<%
 }
}
connection.close();
} 
catch (Exception e) {
e.printStackTrace();
}
%>
</table>    
             
     </div>
    </body>
</html>