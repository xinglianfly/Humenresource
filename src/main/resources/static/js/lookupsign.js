$("#lookupsign").click(
		function() {

			var sels = $("#inputkey").val();
			var month = $("#monthselect").val();
			console.log(sels + "lll");
			$.get("lookupsignmana?lookupsignidmana=" + sels+"&lookupsignmonthmana="+month, function(data) {
				if (data != null) {
					var html = "<tr><td>用户编号</td><td>签到时间</td><td>月份</td><td>是否签到</td></tr>";
					for (var i = 0; i < data.length; i++) {
						console.log(data);
						html = html + "<tr><td>" + data[i].userid + "</td><td>"
								+ new Date(data[i].date) + "</td><td>"
								+ data[i].month + "</td><td>"
								+ data[i].ifsign + "</td></tr>";
					}

					$("#lookupsigntable").html(html);
					
				}
			});

			return false;
		});
