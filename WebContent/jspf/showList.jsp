<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>工资单</title>
<style type="text/css">
#div1{
	margin-top: 50px;
	width: 1000px;
}
table {
	width: 100%;
	border: 1px solid #cceff5;
	background:#fafcfd;

}
td{
	text-align: center;
}

</style>
</head>
<body>

<center><div id="div1">
	<fieldset>
	<legend align="center">工资单</legend>
	<table border="1px">
		<thead>
			<tr>
			<th>姓名</th>
			<th>性别</th>
			<th>月工资数</th>
			<th>请假工资</th>
			<th>加班费</th>
			<th>实得工资</th>
			<th>五险一金</th>
			<th>税金</th>
			<th>最终工资</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${list[0] }</td>
				<td>${list[1] }</td>
				<td>${list[2] }</td>
				<td>${list[3] }</td>
				<td>${list[4] }</td>
				<td>${list[5] }</td>
				<td>${list[6] }</td>
				<td>${list[7] }</td>
				<td>${list[8] }</td>
			</tr>
		</tbody>
	</table>
	</fieldset>
</div></center>

</body>
</html>