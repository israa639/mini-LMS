<%-- 
    Document   : profile
    Created on : Mar 30, 2020, 6:34:07 AM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <title>Edit</title>
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

button {
    font-size: 18px;
    width: 90px;
    height: 50px;
    margin: 10px;
    background: #214584;
    border-color: white;
    border-radius: 50px;
    color: white;
    transition: .25s;
    margin-left: 150px;
    
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
input.check
{
   
    width: 15px;
    height: 15px;
  
    
}
     
 </style>
    <body>
        
        <div class="container" >
         <div class="row">
             <div class="col-lg-3"></div>
             
             <div class="col-lg-6">
                <form class="form-group" method="post"action="edit_profileServlet">
                  <label class="font" >User name :</label><br>
                  <input  type="text" name="uname" class="form-control"value="${obj.getName()}"  placeholder="Enter User-name.." ><br>
                   <label class="font">Email :</label><br>
                 <input  type="text" name="email" class="form-control"value="${obj.getEmail()}" placeholder="Enter email.."  ><br>
                 <label class="font">Current password :</label><br>
                  <input  type="password" id="myInput1" name="pass" class="form-control" placeholder="Enter current password.." >
                  <input type="checkbox" class="check" onclick="myFunction1()" >Show <br>
                 <label class="font">New password :</label><br>
                 <input  type="password" id="myInput2" name="newpass" class="form-control" placeholder="Enter password.." >
                 <input type="checkbox" class="check" onclick="myFunction2()">Show<br>
                  <label class="font">Rewrite password :</label><br>
                  <input  type="password" name="repass" id="myInput3" class="form-control" placeholder="Rewrite password..">
                  <input   type="checkbox" class="check" onclick="myFunction3()" >Show<br>
  
                 <button class="button" >Save</button><br>
              
                 </form>
                 
             </div>
             <div class="col-lg-3"></div>
         </div>
         
   
        <script type="text/javascript">
        function myFunction1() 
        {
             var x = document.getElementById("myInput1");
              if (x.type === "password") 
                {
                    x.type = "text";
                }
              else {
                    x.type = "password";
                   }
        }
         function myFunction2() 
        {
             var x = document.getElementById("myInput2");
              if (x.type === "password") 
                {
                    x.type = "text";
                }
              else {
                    x.type = "password";
                   }
        } function myFunction3() 
        {
             var x = document.getElementById("myInput3");
              if (x.type === "password") 
                {
                    x.type = "text";
                }
              else {
                    x.type = "password";
                   }
        }
        </script>
    </body>
</html>