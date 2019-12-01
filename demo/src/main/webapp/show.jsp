<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W+C/DTD HTM 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Show cities</title>
<link href="index.css" rel="stylesheet" type="text/css">
</head>
<body>
	<table id="table">
		<tr>
			<th id= "th">Id</th>
			<th id= "th">Város</th>
		</tr>
		<c:forEach items="${cities}" var="cities">

			<tr>
				<td id="td">${cities.id}</td>
				<td id="td">${cities.name}</td>
			</tr>

		</c:forEach>
	</table>
	
	<form action="search">
		<div>
			<p id = "sch">id: <input type="number" name="id"></p>
		</div>

		<input type="submit" value="Keresés">
	</form>
	

</body>
</html>