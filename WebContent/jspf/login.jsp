<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>

<style type="text/css">
#div1{
	margin-top:50px;
	width: 500px;
	
}
a{
	margin-left:70px;
	text-decoration: none;	
	font-size: 12px;
}
</style>
</head>
<body>
	<center><div id="div1">
		<form action="<%=request.getContextPath() %>/Login" method="post">
			<fieldset>
				<legend align="center">登录</legend>
				<table>
					<tr>
						<td>用户名:</td>
						<td><input type="text" name="username"></td>
					</tr>
					<tr>
						<td>密   码:</td>
						<td><input type="password" name="password"></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="登录">&nbsp;&nbsp;<input type="reset" value="重置"><a href="<%=request.getContextPath()%>/jspf/register.jsp">注册</a></td>
					</tr>
				</table>
			</fieldset>
		</form>
	</div></center>
</body>
</html>