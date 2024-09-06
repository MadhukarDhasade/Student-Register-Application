<html>
    <head>
        <link href ="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet">
        <title>Login Page</title>
    </head>
    <body>
    <nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
    	<a class="navbar-brand m-1">Madhukar Project</a>
    	<div class="collapse navbar-collapse">
    	</div>
    	<ul class="navbar-nav">
    		<li class="nav-item"><a class="nav-link" href="login">Login</a></li>
    	</ul>
    </nav>
        <div class = "container">
            <form method="post">
                <h1>Please login</h1>
                <hr>
                Username: <input type="text" name = "name">
                Password: <input type="password" name = "password">
                 <input href = "welcome" type="submit" class = "btn btn-success">
                 ${error}
                 <hr>
                 <h4>Please note!!<h4>
                 <h5>Username : Madhukar<h5>
                 <h5>Password : password<h5>
            </form>
             <script src ="webjars\bootstrap\5.1.3\js\bootstrap.min.js"></script>
             <script src ="webjars\jquery\3.6.0\jquery.min.js"></script>
        <div>
    </body>
</html>