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
 <body>
     
     <div class="container">
         <div class="row">
             <div class="col-lg-4"></div>
             <div class="col-lg-4">
                 
                 
                 <form class="form-group" action="create_quizServlet" method="post">
                   <h1 style="text-align: center; margin-bottom: 30px;">Create Quiz</h1>
                  <label>Course code</label>
                     <input type="text" name="code" class="form-control"  required>
                     <label>Quiz Title</label>
                     <input type="text" name="title" class="form-control"  required>
                     <label>Quiz Grade</label>
                     <input type="text" name="grade" class="form-control"  required>

                  <button  name ="next" value="next">Next</button><br>
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
            var code=document.getElementById ("code") ;
            var title=document.getElementById ("title") ;
            var grade=document.getElementById ("grade") ;
            if (code.value.trim()==""&&title.value.trim()==""&&grade.value.trim()=="")
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