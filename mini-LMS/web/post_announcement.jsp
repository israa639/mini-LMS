<%-- 
    Document   : post_announcement
    Created on : Mar 31, 2020, 9:01:54 PM
    Author     : source
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Post Announcement</title>
    <meta charset="utf-8" >
    <meta name="viewport" content="width=device-width , initial-scaler=1.0 , shrink-to-fit=no " >
   
        <link rel="stylesheet" href="css/bootstrap.min.css">
         <link rel="stylesheet" type="text/css" href="css/ann.css" >
    
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <style>
        
        *{
  width: 100%; color:#294372;font-family: sans-serif;
}
h1{
    text-align: center;
    font: bold;
    
}
.container .row .col-lg-6 .col-lg-8 {
  margin-top: 100px;
}
.container .row .col-lg-5 .form-group {
    margin-top: 130px;
    padding: 30px;
     border-style:inherit; 
    border-radius: 25px;
    border-color: #294372;
    box-shadow: 1px 1px 7px 3px;
}

.container .row .col-lg-5 .form-group .a {
    margin-bottom: 20px;
     border-style:inherit; 
    border-radius: 10px;
    border-color: #294372;
    box-shadow: 1px 1px 2px 1px;
}
button {
    font-size: 18px;
    width: 90%;
    height: 40px;
    margin: 20px;
    background: #294372;
    border-color: white;
    border-radius: 50px;
    color: white;
    transition: .25s;
}
button:hover {
    background: white;
    border-color: #294372;
    border-radius: 30px;
    color: #294372;
    transition: .5s;
    box-shadow: 1px 1px 3px 2px;
}
    </style>
    </head>

 <body>
     
     <div class="container">
         <div class="row">
             
             <div class ="col-lg-6">
                 <div class ="col-lg-2"></div>
                 <div class ="col-lg-8">
                     <div class="imgs">
                         <img src="announce1.jpg" height ="150" wigth="150">
                         <img src="announce2.jpg" height ="200" wigth="200">
                      </div>
                 </div>
                 <div class ="col-lg-2"></div>
             </div>
             
             
             <div class ="col-lg-5">
                  <form class="form-group" action="post_announcementServlet" method="post">
                      
                      <h1>Make Announcement</h1>
                     
                     <label>Course code: </label><br>
                     <textarea class="a" rows="1" name="course_code" placeholder="course code"></textarea><br>
                  
                     <label>Announcement title: </label><br>
                     <textarea class="a" rows="1" name="announcement_title" placeholder="Title"></textarea><br>
                    
                     <label>your Announcement: </label><br>
                     <textarea class="a" rows="3" name="announcement" placeholder="Announcement"></textarea><br>
                      
                        <button type="submit" value="submit" name="submit">Announce now</button>
                 </form>
              </div>
             <div class ="col-lg-1"></div>
           
             </div>
             
             
         </div>

     
      
      <script src="js/jquery-3.4.1.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
     
    </body> 
</html>