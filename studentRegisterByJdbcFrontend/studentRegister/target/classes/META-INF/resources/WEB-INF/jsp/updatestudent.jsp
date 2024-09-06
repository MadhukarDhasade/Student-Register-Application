<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <link href ="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet">
        <title>Add student</title>
    </head>
    <body>
     <%@ include file="common/navigation.jsp"%>
     <div class = "container">
        <div><h1>Update your Student</h1></div>
        <hr>
           <form method ="post">
                 Number : <input type="text" name ="id"/>
                 Name : <input type="text" name ="name"/>
                <input type ="submit" class = "btn btn-success"?>
           </form>
        </div>
     <script src ="webjars\bootstrap\5.1.3\js\bootstrap.min.js"></script>
     <script src ="webjars\jquery\3.6.0\jquery.min.js"></script>
    </body>
</html>