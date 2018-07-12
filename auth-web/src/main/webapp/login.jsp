<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="f" action="/auth-web/login.action" method="POST">
	<table>
	<tbody>
	<tr>
		<td>
			User:
		</td>
		<td>
			<input type="text" name="s_username" value="">
		</td>
	</tr>
	<tr>
		<td>
			Password:
		</td>
		<td>
			<input type="password" name="s_password">
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input name="submit" type="submit" value="Login">
		</td>
	</tr>
	</tbody>
	</table>
</form>
</body>
</html>