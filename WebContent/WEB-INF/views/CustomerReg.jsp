<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Form</title>
</head>
<body>
	<form action="insertcust" method="post">
		<pre>
			ID 			: <input type="text" name="custId"/>
			NAME 		: <input type="text" name="custName"/>
			EMAIL 		: <input type="text" name="custEmail"/>
			TYPE 		: <select name="custType">
						  	<option value="">--Select--</option>
						  	<option value="Consumer">Consumer</option>
						  	<option value="Seller">Seller</option>
						  </select>
			ADDRESS	 	: <input type="text" name="custAddr"/>
						  <input type="submit" name="Register"/>
		</pre>
	</form>
	${message}
</body>
</html>