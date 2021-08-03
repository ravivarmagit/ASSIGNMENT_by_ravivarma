<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Interest Calculator</title>
</head>
<body>
<div style="font-size:20px;">Simple Interest Calculator</div>
<form action="/spring-mvc/calculate">
Amount <input type="number" name ="amount" />
Time <input type = "number" name = "time"/>
Rate <input type = "number" name = "rate"/>
<input type="submit" value="Calculate"/>
</form>
</body>
</html>