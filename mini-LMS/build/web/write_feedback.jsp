<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
    <title>Write feedback</title>
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
    color:#294372;
    transition: .25s;
    text-indent:6px;
    font-size: 16px;
    
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
    width: 70px;
    height: 40px;
    margin-left: 240px;
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
.input1
{
    width: 300px;
    height: 30px;
}
.input2
{
    width: 300px;
    height: 250px;
}
    
textarea {
    font-size: 16px;
    width: 50px;
    height: 40px;
    margin: 10px;
    background: white;
    border-color:#214584;
    border-radius: 30px;
    color:#214584;
    transition: .25s;
    margin-left: 130px;
    border-width: 4px;
    text-indent:25px;
    
    
}
textarea:hover {
    background: white;
    border-color: #294372;
    border-radius: 30px;
    color: #294372;
    transition: .5s;
    box-shadow: 1px 1px 3px 2px;
  
}

 </style>

    <body>
         
     <div class="container" >
         <div class="row">
             <div class="col-lg-3"></div>
             
             <div class="col-lg-6">
                 <form class="form-group" action="write_feedbackServlet" method="post">
                     
                     <label class="font">Course code :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                     <input class="input1" type="text" name="code"   /> <br> 
                     <label class="font">Feedback :</label> <br><br> 
                     <textarea class="input2"  name="feedback"></textarea><br>
                     <button>Send</button>
                     
                       
                 </form>
                 
             </div>
             <div class="col-lg-3"></div>
         </div>
                        
         </div>

    </body>
</html>