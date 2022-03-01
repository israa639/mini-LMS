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
    <title>Feedback</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
              
       button {
    font-size: 18px;
    width: 150px;
    height: 40px;
    margin: 20px;
    background: #214584;
    border-color: white;
    border-radius: 50px;
    color: white;
    transition: .25s;
}
button:hover {
    background: white;
    border-color: #214584;
    border-radius: 30px;
    color: #214584;
    transition: .5s;
    box-shadow: 1px 1px 3px 2px;
}
        td b{
            color:white;
        }
    </style>
</head>
<body>
    <div class="container">
         <div class="row">
             <div class="col-lg-3"></div>
             <div class="col-lg-6">
<h2 align="center"><font><strong>Feedback</strong></font></h2>
<table align="center" cellpadding="3" cellspacing="5" border="1" >

<tr bgcolor="#214584">
<td width="350px"><b>feedback</b></td>
<td><b>course code</b></td>
</tr>

<%
try{
DB db=new DB();
ResultSet resultSet = db.selectRS("feedback");
while(resultSet.next()){
%>
<tr>

<td width="350px"><%=resultSet.getString("feedback_content") %></td>
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
<button type="submit" value="ask" name="ask">Write FeedBack</button><br>

</div>
             <div class="col-lg-3"></div>
         </div>
     </div>
</body>
</html>




