<%@ page language="java" contentType="text/html; charset=utf-8"
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
	<div class="form-group" style="margin-right: 20px">
		<a class="col-sm-1 btn btn-primary" id="signone" href="onesign">一键签到</a>
	</div>
	<div class="form-group">
		<a class="col-sm-1 btn btn-primary" id="lookupsignb">查看签到情况</a>
		<div class="col-sm-2">
			<select class="form-control" name="lookupsigs" id="lookupsigs">
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
		<a class="col-sm-1 btn btn-primary" id="lookupprib">查看奖惩记录</a>
		<div class="col-sm-2">
			<select class="form-control" name="monthp" id="monthp">
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
		<a class="col-sm-1 btn btn-primary" id="lookupsalary">查看工资</a>
		<div class="col-sm-2">
			<select class="form-control" name="lookups" id="lookups">
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

	<table class="table table-bordered" style="margin-top: 20px"
		id="lookupsignt"></table>
		<table class="table table-bordered" style="margin-top: 20px"
		id="lookuppapt"></table>
		<table class="table table-bordered" style="margin-top: 20px"
		id="lookupsalt"></table>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/em_lookpap.js"></script>
	<script type="text/javascript" src="js/em_looksign.js"></script>
	<script type="text/javascript" src="js/em_looksalary.js"></script>
</body>
</html>