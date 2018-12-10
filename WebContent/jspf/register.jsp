<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<script type="text/javascript">
function vaildate() {
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	var repassword = document.getElementById("repassword").value;
	var mbsalary = document.getElementById("mbsalary").value;
	var overtimeMoney = document.getElementById("overtimeMoney").value;
	
}

</script>
<style type="text/css">
#div1{
	margin-top:50px;
	width: 500px;
	
}
a{
	margin-left:90px;
	text-decoration: none;	
	font-size: 12px;
}


</style>

</head>
<body>
	<center><div id="div1">
		<fieldset>
		<legend align="center">注册</legend>
			<form action="<%=request.getContextPath() %>/Register" method="post">
				<table>
					<tr>
						<td>姓&nbsp;&nbsp;名:</td>
						<td><input id="username" type="text" name="username"></td>
					</tr>
					<tr>
						<td>性&nbsp;&nbsp;别:</td>
						<td><input id="sex"  type="radio" value="男" name="sex">男&nbsp;&nbsp;<input type="radio" value="女" name="sex">女</td>
					</tr>
					<tr>
						<td>密&nbsp;&nbsp;码:</td>
						<td><input id="password" type="text" name="password"></td>
					</tr>
					<tr>
						<td>确认密码:</td>
						<td><input id="repassword" type="text" name="repassword"></td>
					</tr>
					<tr>
						<td>地&nbsp;&nbsp;址:</td>
						<td><select name="location" id="location">
							<option value="天津">天津</option>
							<option value="北京">北京</option>
							<option value="上海">上海</option>
							<option value="广州">广州</option>
						</select></td>
					</tr>
					<tr>
						<td>基本工资:</td>
						<td><input id="mbsalary" type="text" name="mbsalary"></td>
					</tr>
					<tr>
						<td>加班时费:</td>
						<td><input id="overtimeMoney" type="text" name="overtimeMoney"></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="提交" onclick="return vaildate()">&nbsp;&nbsp;<input type="reset" value="重置"><a href="<%=request.getContextPath() %>/jspf/login.jsp">登录</a></td>
					</tr>
				</table>
			</form>
		</fieldset>
	</div></center>
</body>
</html>