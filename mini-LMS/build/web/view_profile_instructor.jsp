<%-- 
    Document   : profile
    Created on : Mar 30, 2020, 6:34:07 AM
    Author     : pc
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
<html>
    <head>
    <title>Instructor profile</title>
    <meta charset="utf-8" >
    <meta name="viewport" content="width=device-width , initial-scaler=1.0 , shrink-to-fit=no " >
   
        <link rel="stylesheet" href="css/bootstrap.min.css">
         <link rel="stylesheet" type="text/css" href="css/ann.css" >
    
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
 </head>
   <style>
     *{ width: 100%; background: white; color:#294372;}

body {background: white; }

.container {
    margin-top:50px; 
    font-weight: bold;
    font-family: sans-serif;
    font-size: 25px;
}

.container .form-group{
    padding: 30px;
    border-style:double; 
    border-radius: 25px;
    border-color: #192946;
    box-shadow: 1px 1px 7px 3px;
    
    
}
.container .form-group input:hover {box-shadow: 1px 1px 3px 2px;}

.form-group input{
    margin-bottom: 20px;
    background: white;
    border-color: #294372;
    border-radius: 50px;
    color: #294372;
    transition: .25s;
    width: 370px;
    height: 35px;
    padding-left: 15px;
    font-size: 20px;
    margin-top: 8px;
}
.form-group .b input{
    width: 10px;
   position: absolute;
}
.form-group .b p {
    margin: 0px 0 3px 20px;
}
.form-group input:focus{
    background: white;
}


::-webkit-input-placeholder{
    font-size: 12px;
    letter-spacing: 1px;
    color: #294372; 
}

     
 </style>

<%
try{
DB db=new DB();
user u = new instructor();
Connection connection=db.getConnection();
Statement statement=connection.createStatement();
String sql ="select * from instructor where instructor_id="+u.getId();
ResultSet resultSet = statement.executeQuery(sql);
while(resultSet.next())
{
%>
    <body> 
<div class="container" >
<div class="row">
<div class="col-lg-3"></div>           
<div class="col-lg-6">
    <h2 align="center"><font><strong>Your Profile</strong></font></h2>
<form class="form-group">
<label class="font">User name :</label><br>
    <input  type="text" name="uname" class="form-control" readonly="readonly" value="<%=resultSet.getString("instructor_name")%>" ><br>
<label class="font">Email :</label><br>
    <input  type="text" name="e_mail" class="form-control"  readonly="readonly"value="<%=resultSet.getString("instructor_email")%>" ><br>
<label class="font">Position :</label><br>
    <input  type="text" name="position"  class="form-control" readonly="readonly" value="<%=resultSet.getString("instructor_position")%>"><br>
<label class="font">Gender :</label><br>
    <input  type="text" name="gender"  class="form-control" readonly="readonly" value="<%=resultSet.getString("instructor_gender")%>"><br>
                 
</form>
    </div>
<div class="col-lg-3"></div>
</div>
</div>
</body>
<%
 }
connection.close();
} 
catch (Exception e) {
e.printStackTrace();
}
%>              


</html>