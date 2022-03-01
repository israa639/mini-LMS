<%-- 
    Document   : register
    Created on : Apr 17, 2020, 6:41:59 PM
    Author     : source
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html> 
<html>
<head>
    <title>Coursera</title>
    <meta charset="utf-8" >
    <meta name="viewport" content="width=device-width , initial-scaler=1.0 , shrink-to-fit=no " >
   
        <link rel="stylesheet" href="css/bootstrap.min.css">
         <link rel="stylesheet" type="text/css" href="css/reg.css" >
    
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
  
    </head>

     
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
  <body>
    
     <!-- html -->
      
     <div class="container">
         <div class="row">
           <div class="col-lg-3"></div>
            <div class="col-lg-6">
                 
                
         <form class="form-group" action="insert_questionServlet" method="post">
         <h1 style="text-align: center; margin-bottom: 30px;">make Question</h1>
                     
         <label class="font">Question</label><br>
    <input  type="text" name="question" class="form-control" ><br>
    <label class="font">choice A</label><br>
    <input  type="text" name="choice1" class="form-control" ><br>
    <label class="font">choice B</label><br>
    <input  type="text" name="choice2"  class="form-control"><br>
   <label class="font">choice C</label><br>
    <input  type="text" name="choice3"  class="form-control"  <br>
   <label class="font">choice D</label><br>
    <input  type="text" name="choice4"  class="form-control"  ><br>
   <label class="font">Write Answer</label><br>
    <input  type="text" name="answer"  class="form-control" ><br>
    <button href="#">Next Question</button>
    </form>                
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
            var quistion=document.getElementById ("quistion") ;
            var a=document.getElementById ("a") ;
            var b=document.getElementById ("b") ;
            var c=document.getElementById ("c") ;
            var d=document.getElementById ("d") ;
            var answer=document.getElementById ("answer") ;
            if (quistion.value.trim()==""||a.value.trim()==""||b.value.trim()==""|| 
                c.value.trim()==""||d.value.trim()==""||answer.value.trim()=="")
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