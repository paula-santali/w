<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADDING</title>

<style type="text/css">
body {
	text-align: center;
}
</style>

</head>
<body>
	Please input question text
	<form action="add_actions">
		<input type="text" name="question_text" value="input text here">
		<br> Please select a Category of Question: <br> C# <input
			type="checkbox" name="category" value="C#" /> Java <input
			type="checkbox" name="category" value="Java" /> C++ <input
			type="checkbox" name="category" value="C++" /> <br> Please
		select Level for Question<br> 1<input type="radio"
			name="question_level" value=1 checked="checked"> 2<input
			type="radio" name="question_level" value=2> 3<input
			type="radio" name="question_level" value=3> 4<input
			type="radio" name="question_level" value=4> 5<input
			type="radio" name="question_level" value=5> <br> Please
		input Answer to this Question<br> Answer 1 <input type="text"
			name="answer_text_1" value="input text here"> <br>
		Answer 2 <input type="text" name="answer_text_2"
			value="input text here"> <br> Answer 3 <input
			type="text" name="answer_text_3" value="input text here"> <br>
		Answer 4 <input type="text" name="answer_text_4"
			value="input text here"> <br>Please input number a right
		question answer<br> <input type="text" name="trueAnswerNumber"
			value="0584"><br> <input type="submit">
	</form>
	<br>
	<script type="text/javascript">
		document.write("${result}");
	</script>
</body>
</html>