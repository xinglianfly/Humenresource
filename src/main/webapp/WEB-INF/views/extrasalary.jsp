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
				<h4>奖惩记录</h4>
			</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form" action="salary"
					method="post">
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">用户编号</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="userid">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">用户名</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="username">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">原因</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="cause">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">金额</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="money">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">月份</label>
						<div class="col-sm-4">
							<select class="form-control" name="month" id="according">
								<option value="1">一月</option>
								<option value="2">二月</option>
								<option value="3">三月</option>
								<option value="4">四月</option>
								<option value="5">五月</option>
								<option value="6">六月</option>
								<option value="7">七月</option>
								<option value="8">八月</option>
								<option value="9">九月</option>
								<option value="10">十月</option>
								<option value="11">十一月</option>
								<option value="12">十二月</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-5 col-sm-10">
							<button type="submit" class="btn btn-primary btn-lg">提交</button>
						</div>
					</div>
				</form>
				<div class="errormessage col-sm-offset-5 col-sm-10">${errormessage }</div>


			</div>
		</div>

	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>