<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  下面请求的名字叫做hello   a标签发送的是get请求-->
	<a  href="test/hello"?name=""我是1" value="你是1">hello Spring</a>
	<a href="test/helloo">不是hello请求</a>
	<form href = "hello" method="post">
		<h1> post hello </h1>
		<h2>hello i am github</h2>	
		<h3>i am eclipse</h3>
	
	</form>
</body>
</html>
