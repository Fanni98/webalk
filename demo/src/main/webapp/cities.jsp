<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Home</title>
<link href="index.css" rel="stylesheet" type="text/css">
</head>
<body>

	<div id="banner">
		Városok
		<div id="menuBar">
			<form action="regist">
				<input type="submit" value="Új város hozzáadása">
			</form>

			<form action="showCities">
				<input type="submit" value="Muti a városokat">
			</form>

		</div>
	</div>

	<div>
		<img id="city" src="city.png" alt="City">
	</div>

</body>
</html>