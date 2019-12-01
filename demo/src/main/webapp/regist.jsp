<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W+C/DTD HTM 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Regist</title>
<link href="index.css" rel="stylesheet" type="text/css">
</head>
<body>

	<form action="addCity">

		<div>
			<p>
				Város neve: <input type="text" name="name" required="required">
			</p>
		</div>
		<div>
			<p>
				Népesség: <input type="number" name="population" value="1000"
					required="required">
			</p>
		</div>

		<input type="submit" value="Hozzáadás">
	</form>
	

</body>
</html>