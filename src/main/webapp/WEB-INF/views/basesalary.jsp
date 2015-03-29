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
				<h4>录入基本工资</h4>
			</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form" action="entergrade"
					method="post">
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">级别1</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="grade1">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">级别2</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="grade2">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">级别3</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="grade3">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">级别4</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="grade4">
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