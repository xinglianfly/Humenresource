<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/base.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="panel panel-default registe">
			<div class="panel-heading">
				<h4>登陆</h4>
			</div>
			<div class="panel-body">
				<div id="login-body">

					<form class="form-horizontal" role="form" action="manager_login"
						method="post">

						<div class="input-group">
							<div class="input-group-addon">
								<span class="glyphicon glyphicon-user"></span>
							</div>
							<input class="form-control" type="text" placeholder="用户名"
								name="username" id="username">
						</div>
						<div class="input-group">
							<div class="input-group-addon">
								<span class="glyphicon glyphicon-asterisk"></span>
							</div>
							<input class="form-control" type="password" placeholder="密码"
								name="password" id="password">
						</div>
						<button type="submit" class="btn btn-primary btn-lg btn-block"
							style="margin-top: 5px" name="login" value="login"
							onclick="return complete()">登陆</button>
							
							
					</form>
					<div class="errormessage col-sm-offset-5 col-sm-10">${errormessage }</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="js/login_confirm.js"></script>
</body>
</html>