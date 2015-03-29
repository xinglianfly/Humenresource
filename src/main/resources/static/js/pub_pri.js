
$("#inputPassword").click(function() {

	var sels = $("#according").val();
	console.log(sels+"lll");
	var key = $("#inputkey").val();
	console.log(sels + "key");
	if (sels === "1") {
		$.get("loup_papname?key=" + key, function(data) {
			var html="<tr><td>用户编号</td><td>用户名</td><td>原因</td><td>罚金</td><td>时间</td><td>修改</td></tr>";
			 for(var i=0;i<data.length;i++){
				 console.log(data);
				 html=html+"<tr><td>"+data[i].id+"</td><td>"+data[i].name+"</td><td>"+data[i].cause+"</td><td>"+data[i].money+"</td><td>"+new Date(data[i].time)+"</td><td></td></tr>";
			 }
			
			$("#pri_pub").html(html);
		});

	}else{
		$.get("loup_papid?keyid=" + key, function(data) {
			var html="<tr><td>用户编号</td><td>用户名</td><td>原因</td><td>罚金</td><td>时间</td><td>修改</td></tr>";
			console.log(data+"dag");
			 html=html+"<tr><td>"+data.id+"</td><td>"+data.name+"</td><td>"+data.cause+"</td><td>"+data.money+"</td><td>"+new Date(data.time)+"</td><td></td></tr>";
			$("#pri_pub").html(html);
		});

	}

	return false;
});
