<%-- 
    Document   : login
    Created on : Apr 17, 2020, 6:43:08 PM
    Author     : source
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
    <title>Coursera</title>
    <meta charset="utf-8" >
    <meta name="viewport" content="width=device-width , initial-scaler=1.0 , shrink-to-fit=no " >
   
        <link rel="stylesheet" href="css/bootstrap.min.css">
         <link rel="stylesheet" type="text/css" href="css/log.css" >
    
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    

    </head>

 <body>
     
 <style>
     *{ width: 100%; background: white; color:#294372;}

body {background: white; }

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
.container .form-group input:hover {box-shadow: 1px 1px 3px 2px;}

.form-group input{
    margin-bottom: 20px;
    background: white;
    border-color: #294372;
    border-radius: 50px;
    color: #294372;
    transition: .25s;
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
     
     <div class="container">
         <div class="row">
             <div class="col-lg-4"></div>
             <div class="col-lg-4">
                 
                 
                 <form class="form-group" action="loginServlet" method="post">
                   <h1 style="text-align: center; margin-bottom: 30px;">Login</h1>
                  <label>Email</label>
                     <input type="text" name="email" class="form-control" placeholder="Enter your User-name.." required>
                  <label>password</label>
                 <input type="password" name="password" class="form-control" placeholder="Enter your password.." required>
                  
                  <div class="b">
                         <input type="radio" name="user" value ="instructor" class="gender"><p>Instructor</p>
                         <input type="radio" name="user" value="student" class="gender"><p>Student</p> 
                             </div>
                  <button type="submit" value="Login" name="submit">Login</button><br>
                  <a href="#">Lost your password?</a><br>
                  <a href="http://localhost:8080/coursera_project/signup.jsp">Don't have an account?</a>
                 </form>
             
             
             </div>
             <div class="col-lg-4"></div>
         </div>
     </div>
     
      <script src="js/jquery-3.4.1.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
     
     <!-- javascript -->
    
        <script type="text/javascript">
        function validate() 
        {
            var username=document.getElementById ("uname") ;
            var password=document.getElementById ("pass") ;
            if (username.value.trim()==""|| password.value.trim()=="")
            {alert("no blank value allowed");
             return false ;
            }
            else {
                true;
            }
        }
    </script>
     
    </body>
</html>

