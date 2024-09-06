<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link href ="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet">
        <title>Register Page</title>
    </head>
    <body>
        <%@ include file="common/navigation.jsp"%>
        <div class = "container">
           <div><h1>Your Register</h1></div>
           <hr>
            <div><h2>Students</h2></div>
            <table class = "table">
                <thead>
                    <tr>
                        <th>Number</th>
                        <th>Name</th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items= "${students}" var = "students">
                        <tr>
                            <td>${students.id}</td>
                            <td>${students.name}</td>
                            <td><a href="delete-student?id=${students.id}" class="btn btn-warning">Delete</td>
                            <td><a href="update-student?id=${students.id}" class="btn btn-success">Update</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <a href = "add-student" class = "btn btn-success">Add</a>
        </div>
        <script src ="webjars\bootstrap\5.1.3\js\bootstrap.min.js"></script>
        <script src ="webjars\jquery\3.6.0\jquery.min.js"></script>

    </body>
</html>