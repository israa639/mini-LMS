 <%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>

<%--
 
 String stat="select material_id from material where instructor_id=21345 ";
 
  sec c1=new sec();
   PreparedStatement ps=c1.connect().prepareStatement(stat);

   ResultSet rs = ps.executeQuery();
   ArrayList<String>lecture_id  = new ArrayList<String>();
   while (rs.next()) {
     lecture_id.add(rs.getString("material_id"));
   }
 

 --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
    <title>upload</title>
    <meta charset="utf-8" >
    <meta name="viewport" content="width=device-width , initial-scaler=1.0 , shrink-to-fit=no " >
   
        <link rel="stylesheet" href="css/bootstrap.min.css">
         <link rel="stylesheet" type="text/css" href="css/reg.css" >
    
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
  
    
   <body>
     
     <style>
         
         *{ width: 100%; background:whitesmoke ; color:#294372;}

body {background: whitesmoke; }

.container {
    margin-top:50px; 
    font-weight: bold;
    font-family: sans-serif;
}
.container .form-group{
    padding: 30px;
    border-style:double; 
    border-radius: 25px;
    border-color: #192946;
    box-shadow: 1px 1px 7px 3px;
    
    
}
.container .form-group .a input:hover {box-shadow: 1px 1px 3px 2px;}

.form-group .a input{
    margin-bottom: 20px;
    background:whitesmoke;
    border-color: #294372;
    border-radius: 50px;
    color: #294372;
    transition: .25s;
}
.form-group .a input:focus{
    background:whitesmoke;
}
.form-group .b input{
    width: 10px;
   position: absolute;
}
.form-group .b p {
    margin: 0px 0 3px 20px;
}

button {
    font-size: 18px;
    width: 90%;
    height: 40px;
    margin: 10px;
    background: #214584;
    border-color: whitesmoke;
    border-radius: 50px;
    color: whitesmoke;
    transition: .25s;
}
button:hover {
    background: whitesmoke;
    border-color: #294372;
    border-radius: 30px;
    color: #294372;
    transition: .5s;
    box-shadow: 1px 1px 3px 2px;
}
::-webkit-input-placeholder{
    font-size: 12px;
    letter-spacing: 1px;
    color: #294372; 
}
         
     </style>
   
       

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>upload</title>
    </head>
    <body>
         
        <form action="upload_pdfServlet"method="post" enctype="multipart/form-data">
Select File to Upload:<input type="file" name="fileName">
<br>
<input type="submit" value="Upload">
        </form>
    </body>
</html>
