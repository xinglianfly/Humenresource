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
				<h4>登陆</h4>
			</div>
			<div class="panel-body">
				<form class="form-inline" role="form">
					<table class="table table-bordered" style="margin-top: 20px"
						id="employee">
						<tr>
							<td>用户编号</td>
							<td>签到时间</td>
							<td>月份</td>
							<td>是否签到</td>
						</tr>

						<c:forEach var="item" items="${lookuponesignall}">
							<tr>
								<td>${item.id}</td>
								<td>${item.date}</td>
								<td>${item.month}</td>
								<td>${item.ifsign}</td>
							</tr>
							
						</c:forEach>
					</table>
					
					
					<c:forEach var="list" step="1"  begin="1" end ="${lookuponesignallsize}">
					<a href="lookpagesign?page=${list-1}&size=2&sort=id">${ list}</a>
					</c:forEach>
					
					<%-- <%for(int i=0;i<${totalpage}<%;i++){%>
						<a href="lookpagesign?page=0&size=1&sort=id">i</a>
				<%	}%> --%>
				</form>
			</div>
		</div>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/search.js"></script>
</body>
</html>