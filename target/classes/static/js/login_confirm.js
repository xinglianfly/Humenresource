function complete() {
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	console.log(username + "lll");
	if (username ==null || password ==null) {
		alert("请将信息填写完整");
		return false;
	}else if(username!="admin"||password!="admin"){
		alert("用户名或密码错误");
		return false;
	}else if(username=="admin"&&password=="admin"){
		return true;
	}

	
}
