<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>
<body>
	<div>
		<form action="<%=request.getContextPath()%>/MonthSalary" method="post">
			<table>
				<tr>
					<td>请假天数:</td>
					<td><input name="quitdays" type="text" />&nbsp;天</td>
				</tr>
				<tr>
					<td>加班时长:</td>
					<td><input name="overtime" type="text" />&nbsp;时</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="提交" />&nbsp;&nbsp;<input
						type="reset" value="重置" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>