<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/base.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<div class="panel panel-default registe">
			<div class="panel-heading">
				<h4>查看所有人信息</h4>
			</div>
			<div class="panel-body">
				<form class="form-inline" role="form">
					<table class="table table-bordered" style="margin-top: 20px"
						id="lookallinfot">
						<tr>
							<td>用户编号</td>
							<td>用户名</td>
							<td>性别</td>
							<td>邮箱</td>
							<td>电话</td>
							<td>员工进入公司时间</td>
							<td>级别</td>
							<td>工作</td>
							<td>年龄</td>
							<td>接受培训</td>
							<td>技能</td>
							<td>部门</td>
							<td>修改状态</td>
						</tr>

						<c:forEach var="item" items="${lookupallinfocontent}">
							<tr>
								<td>${item.id}</td>
								<td>${item.name}</td>
								<td>${item.sex}</td>
								<td>${item.email}</td>
								<td>${item.tel}</td>
								<td>${item.enterTime}</td>
								<td>${item.grade}</td>
								<td>${item.job}</td>
								<td>${item.age}</td>
								<td>${item.training}</td>
								<td>${item.skills}</td>
								<td>${item.department}</td>
								<td><a href="changename?id=${item.id }">修改</a> <a
									href="deletename?id=${item.id }">删除"</a></td>
							</tr>
						</c:forEach>
					</table>
					<c:forEach var="list" step="1" begin="1" end="${infoallpage}">
						<a href="lookupinfopage?page=${list-1}&size=2&sort=id">${ list}</a>
					</c:forEach>
				</form>
			</div>
		</div>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>