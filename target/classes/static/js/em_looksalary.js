$("#lookupsalary")
		.click(
				function() {

					var sels = $("#lookups").val();
					console.log(sels + "lll");
					$
							.get(
									"lookupsal?lookupsalkey=" + sels,
									function(data) {
										if (data != null) {
											var html = "<tr><td>用户编号</td><td>月份</td><td>基本工资</td><td>奖惩工资</td><td>总工资</td></tr>";
											console.log(data);
											html = html + "<tr><td>"
													+ data.userid + "</td><td>"
													+ data.month + "</td><td>"
													+ data.basesalary
													+ "</td><td>"
													+ data.extramoney
													+ "</td><td>"
													+ data.allmoney
													+ "</td></tr>";

											$("#lookupsalt").html(html);
											$("#lookuppapt").html("");
											$("#lookupsignt").html("");
										}
									});

					return false;
				});
