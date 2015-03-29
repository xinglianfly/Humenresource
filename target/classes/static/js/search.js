
$("#inputPassword").click(function() {

	var sels = $("#according").val();
	console.log(sels+"lll");
	var key = $("#inputkey").val();
	console.log(sels + "key");
	if (sels === "1") {
		$.get("searchname?keyname=" + key, function(data) {
			var html="<tr><td>用户编号</td><td>用户名</td><td>性别</td><td>邮箱</td><td>电话</td><td>员工进入公司时间</td><td>级别</td><td>工作</td><td>年龄</td><td>接受培训</td><td>技能</td><td>部门</td><td>是否在职</td><td>修改状态</td></tr>";
			 for(var i=0;i<data.length;i++){
				 console.log(data);
				 html=html+"<tr><td>"+data[i].id+"</td><td>"+data[i].name+"</td><td>"+data[i].sex+"</td><td>"+data[i].email+"</td><td>"+data[i].tel+"</td><td>"+new Date(data[i].enterTime)+"</td><td>"+data[i].grade+"</td><td>"+data[i].job+"</td><td>"+data[i].age+"</td><td>"+data[i].training+"</td><td>"+data[i].skills+"</td><td>"+data[i].ifwork+"</td><td>"+data[i].department+"</td><td><a href="+"changename?id="+data[i].id+">"+"修改"+"</a>    <a href=deletename?id="+data[i].id+">"+"删除"+"</a></td></tr>";
			 }
			
			$("#employee").html(html);
		});

	}else{
		$.get("searchid?keyid=" + key, function(data) {
			var html="<tr><td>用户编号</td><td>用户名</td><td>性别</td><td>邮箱</td><td>电话</td><td>员工进入公司时间</td><td>级别</td><td>工作</td><td>年龄</td><td>接受培训</td><td>技能</td><td>部门</td><td>是否在职</td><td>修改状态</td></tr>";
			console.log(data+"dag");
				 html=html+"<tr><td>"+data.id+"</td><td>"+data.name+"</td><td>"+data.sex+"</td><td>"+data.email+"</td><td>"+data.tel+"</td><td>"+new Date(data.enterTime)+"</td><td>"+data.grade+"</td><td>"+data.job+"</td><td>"+data.age+"</td><td>"+data.training+"</td><td>"+data.skills+"</td><td>"+data.department+"</td><td>"+data.ifwork+"</td><td><a href="+"changename?id="+data.id+">"+"修改"+"</a>    <a href=deletename?id="+data.id+">"+"删除"+"</a></td></tr>";
			$("#employee").html(html);
		});

	}

	return false;
});
