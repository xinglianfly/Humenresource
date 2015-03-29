<%@ page language="java" contentType="text/html; charset=utf-8" import="java.util.*,com.example.*;"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
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
					<div class="form-group">

						<select class="form-control col-sm-3 col-offset-2"
							name="according" id="according">
							<option value="1">根据员工姓名</option>
							<option value="2">根据员工编号</option>

						</select> <input type="text" class="form-control col-sm-5" id="inputkey"
							placeholder="请输入"> 
							<a class="btn btn-primary"
							 id="inputPassword" 
							>提交</a>
					</div>

					<table class="table table-bordered" style="margin-top: 20px"id="employee">
					
					</table>
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