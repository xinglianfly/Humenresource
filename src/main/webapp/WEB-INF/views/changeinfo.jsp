<%@page import="com.example.domain.Employee"%>
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
				<h4>注册</h4>
			</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form" action="changeinfom"
					method="post">
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">用户名</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="name"
								id="username" value=${ employee.name }>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">年龄</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="age" value=${ employee.age }>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">e-mail</label>
						<div class="col-sm-4">
							<input class="form-control" type="email" name="email" value=${ employee.email }>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">电话</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="tel" value=${ employee.tel }>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">部门</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="department" value=${ employee.department }>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">工作</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="job" value=${ employee.job }>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">培训</label>
						<div class="col-sm-4">
							<textarea class="form-control" rows="4" name="training">${ employee.training }</textarea>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">技能</label>
						<div class="col-sm-4">
							<textarea class="form-control" rows="4" name="skills">${ employee.skills }</textarea>


						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">级别</label>
						<div class="col-sm-4">
							<select class="form-control col-sm-3 col-offset-2"
							name="grade" id="grade">
							<option value="1">级别1</option>
							<option value="2">级别2</option>
							<option value="3">级别3</option>
							<option value="4">级别4</option>
						</select>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">性别</label>
						<div class="col-sm-4">
							<div class="radio">
								<label> <input type="radio" name="sex" id="sexman"
									value="man" checked="checked">男
								</label> <label> <input type="radio" name="sex" id="sexwoman"
									value="woman">女
								</label>
							</div>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 col-sm-offset-3 control-label">是否在职</label>
						<div class="col-sm-4">
							<div class="radio">
								<label> <input type="radio" name="ifwork"
									id="optionsRadios1" value="yes" checked="checked">是
								</label> <label> <input type="radio" name="ifwork"
									id="optionsRadios2" value="no">否
								</label>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-5 col-sm-10">
							<button type="submit" class="btn btn-primary btn-lg">提交修改</button>
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