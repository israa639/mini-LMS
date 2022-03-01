<%-- 
    Document   : register
    Created on : Apr 17, 2020, 6:41:59 PM
    Author     : source
--%>

<%@page import="model.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
    <title>Sign up</title>
    <meta charset="utf-8" >
    <meta name="viewport" content="width=device-width , initial-scaler=1.0 , shrink-to-fit=no " >
   
        <link rel="stylesheet" href="css/bootstrap.min.css">
         <link rel="stylesheet" type="text/css" href="css/reg.css" >
    
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
  
    </head>

 <body>
     
     <style>
         
         *{ width: 100%; background:white ; color:#294372;}

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
.container .form-group .a input:hover {box-shadow: 1px 1px 3px 2px;}

.form-group .a input{
    margin-bottom: 20px;
    background:white;
    border-color: #294372;
    border-radius: 50px;
    color: #294372;
    transition: .25s;
}
.form-group .a input:focus{
    background:white;
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
     
     <!-- html -->
      
     <div class="container">
         <div class="row">
           <div class="col-lg-3"></div>
            <div class="col-lg-6">^
                 
                <div class="ui">
                 <form class="form-group" action="sign_upServlet" method="post">
                   <h1 style="text-align: center; margin-bottom: 30px;">Register here</h1>
                     <div class="a">
                     <div class="row">
                     <div class="col-lg-6">
                         <label>First Name</label>
                         <input type="text" name="fname" class="form-control" placeholder="Enter your first name.." required>
                    </div>

                     <div class="col-lg-6">
                         <label>Last Name</label>
                         <input type="text" name="lname" class="form-control" placeholder="Enter your last name.." 
                                required>
                    </div>
                     </div>
                         
                                             
                     <label>E-mail</label>
                     <input type="email" name="email" class="form-control" placeholder="Enter your Email.."
                            required>
                     
                     <div class="row">
                     <div class="col-lg-6">
                         <label>password</label>
                         <input type="password" name="pass" class="form-control" placeholder="Enter your password.."
                                required>
                    </div>

                     <div class="col-lg-6">
                         <label>Re-type password</label>
                         <input type="password" name="rpass" class="form-control" placeholder="Re-type password again.."
                                required>
                    </div>
                     </div>
                     </div>
                     
                     <div class="b">
                         <div class="row">
                     <div class="col-lg-6">
                         <input type="radio" name="gender" value="male" class="gender"><p>Male</p>
                         <input type="radio" name="gender" value="female" class="gender"><p>Female</p>              
                             </div>
                             
                         <div class="col-lg-6">
                         <input type="radio" name="user" value="instructor" class="gender"><p>Instructor</p>
                         <input type="radio" name="user" value="student" class="gender"><p>Student</p> 
                             </div>
                         </div>
                     </div>
                         <button type="submit" value="submit" name="submit">Submit</button>
                         <button type="reset" value="reset" name="submit">Reset</button>
                     
                 </form>
                
                </div>
                
             </div>
             <div class="col-lg-3"></div>
         </div>
     </div>
     
     
     <script src="js/jquery-3.4.1.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
     
     <!-- javascript -->
     <script type="text/javascript">
        function validate() 
        {
            var firstname=document.getElementById ("fname") ;
            var lastname=document.getElementById ("lname") ;
            var username=document.getElementById ("uname") ;
            var email=document.getElementById ("email") ;
            var password=document.getElementById ("pass") ;
            var rpassword=document.getElementById ("rpass") ;
            if (firstnamename.value.trim()==""||lastname.value.trim()==""||username.value.trim()==""|| 
                email.value.trim()==""||password.value.trim()==""||rpassword.value.trim()=="")
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