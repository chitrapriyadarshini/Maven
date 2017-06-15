<html>
<head>
<title>New User Registration</title>
</head>
<body>


<form action="UserRegisterServlet" method="post">

<table style="width:100%">
  <tr>
    <td>ID</td>
    <td><input type="number" name="id" required></td>      
  </tr>
  <tr>
    <td>Name</td>
    <td><input type="text" name="name" required></td>       
  </tr>
  <tr>
    <td>User name</td>
    <td><input type="text" name="userName" required></td>       
  </tr>
  <tr>
    <td>Password</td>
    <td><input type="password" name="password" required></td>       
  </tr>
  <tr>
    <td>Mobile Number</td>
    <td><input type="number" name="mobileNumber"></td>       
  </tr>
  <tr>
    <td>Email ID</td>
    <td><input type="text" name="emailID"></td>       
  </tr>
  <tr>
    <td>Role ID</td>
    <td><input type="number" name="roleId"></td>       
  </tr>
</table>
<br>
<center><button type="submit">Register</button></center>

</form>
</body>
</html>

