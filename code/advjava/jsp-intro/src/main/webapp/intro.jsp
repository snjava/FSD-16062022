<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Introduction</title>

<style type="text/css">
	h1 {
		background-color: yellow;
	}
</style>

<script type="text/javascript">
	alert("Hello This is JavaScript from JSP page");
	console.log("Hello This is JavaScript from JSP page");
</script>

<!-- External CSs and JS -->
<link rel="stylesheet" href="css/style.css">
<script src="js/demo.js" ></script>

</head>
<body>
	<div>
		<img alt="ascii-table image" src="image/ascii-table.jpg" width="500" height="200">
	</div>

	<div align="center">
		<h1 style="color: red;">Welcome to First JSP Page</h1>
		<form>
			Enter Name : <input type="text" name="name">
			<br/><br/>
			Enter Message :  <input type="text" name="msg">
			<br/><br/>
			Select gender : <input type="radio" name="gender" value="Male"> Male
							<input type="radio" name="gender" value="Female"> Female
			<br/><br/>
			<button type="button" onclick="submitDetails()">Send</button> 
		</form>
	</div>
</body>
</html>