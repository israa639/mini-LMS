<%@page import="model.DB"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import ="java.sql.*" %>
<%@page import=" java.io.*" %>



<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
    <title>Announcement</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        td b {
    color:white;
}
    </style>
</head>
<body>
    <div class="container">
         <div class="row">
             <div class="col-lg-3"></div>
             <div class="col-lg-6">
<h2 align="center"><font><strong>Announcement</strong></font></h2>
<table align="center" cellpadding="3" cellspacing="5" border="1" >

<tr bgcolor="#214584">
<td width="350px"><b>Announcement content</b></td>
<td><b> Announcement date</b></td>
<td><b>Course code</b></td>
</tr>

<%
try{
DB db=new DB();
String sql ="select * from announcement";
ResultSet resultSet = db.selectRS("announcement");
while(resultSet.next()){
%>
<tr>

<td width="350px"><%=resultSet.getString("announcement_content") %></td>
<td><%=resultSet.getString("announcement_date") %></td>
<td><%=resultSet.getString("course_code") %></td>
</tr>
<%
}

} 
catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</div>
             <div class="col-lg-3"></div>
         </div>
     </div>
</body>
</html>