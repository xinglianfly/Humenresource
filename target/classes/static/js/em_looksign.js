$("#lookupsign")
		.click(
				function() {

					var sels = $("#monthp").val();
					console.log(sels + "lll");
					$.get("lookuppap?lookuppaps=" + sels,
									function(data) {
										if (data != null) {
											var html = "<tr><td>用户编号</td><td>奖惩记录</td><td>罚金</td><td>时间</td></tr>";
											for (var i = 0; i < data.length; i++) {
												console.log(data);
												html = html
														+ "<tr><td>"
														+ data[i].userid
														+ "</td><td>"
														+ data[i].cause
														+ "</td><td>"
														+ data[i].money
														+ "</td><td>"
														+ new Date(data[i].time)
														+ "</td></tr>";
											}

											$("#lookuppapt").html(html);
											$("#lookupsalt").html("");
											$("#lookupsignt").html("");
										}
									});

					return false;
				});
