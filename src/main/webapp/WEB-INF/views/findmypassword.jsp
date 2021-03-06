<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap 101 Template</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/base.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<div class="panel panel-default register">
			<div class="panel-heading">
				<h4>重新设置密码</h4>
			</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form" action="lastsetpassword"
					method="post">
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-1 control-label">用户编号</label>
						<div class="col-md-8">
							<input class="form-control" type="text" name="userid"
								id="subject">
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-1 control-label">新密码</label>
						<div class="col-md-8">
							<input class="form-control" type="text" name="newPassword"
								id="subject">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-1 control-label">再输入一次</label>
						<div class="col-md-8">
							<input class="form-control" type="text" name="newpassagain"
								id="subject">
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-7 col-sm-10">
							<button type="submit" class="btn btn-primary btn-lg">确认</button>
						</div>
					</div>
				</form>
			</div>
		</div>

	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

	<script src="js/bootstrap.min.js"></script>
</body>
</html>