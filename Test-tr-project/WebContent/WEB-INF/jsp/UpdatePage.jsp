<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Tale All Questions</title>
<style type="text/css">
body {
	text-align: center;
}
td:hover{
background-color: yellow;
}
</style>
</head>
<body>

	<form action="update_actions">
		<input type="text" name="question"> <input type="submit"
			value="Search">
	</form>
	<br>
	<script type="text/javascript">document.getElementsByTagName('td')
		document.write("${result}");	
	</script>
	
</body>
</html>