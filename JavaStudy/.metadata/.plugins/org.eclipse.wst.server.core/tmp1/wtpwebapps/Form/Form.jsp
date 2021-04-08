<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<from action="#" method="post">
		<p>名前:</p>
		<input type="text" name="name size="30" maxlength="20">
		
		<p>パスワード</p>
		<input type="password" name="pass">
		
		<div class="hecked">
			<p>言語選択</p>
			<input type="checkbox" name="language" value="html" checked="checked">HTML
			<input type="checkbox" name="language" value="css">CSS
			<input type="checkbox" name="language" value="php">PHP
			<input type="checkbox" name="language" value="Java">Java
		</div>
	</from>
</body>
</html>