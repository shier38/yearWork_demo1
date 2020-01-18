<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resource/css/list.css">
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
	function delAll(){
		var ids =[];
		$(".ck:checked").each(function(){
			ids.push(this.value);
		})
		if(ids.length>0){
			if(confirm("确定要删除吗？")){
				location.href = "delAll?ids="+ids;
			}
		}else{
			alert("请选择要删除的数据！")
		}
	}
</script>
</head>
<body>
<h1 align="center" style="font-size: 30px">准能公司2019年投资计划</h1>
	<form action="list" method="post">
	<input name="name" value="${p.name }"><button>查找</button>
	<button onclick="delAll()">批量删除</button>
		<table>
			<tr>
				<td>选择</td>
				<td>主键</td>
				<td>项目名称</td>
				<td>投资金额</td>
				<td>分管领导</td>
				<td>部门</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${list }" var="p">
				<tr>
				<td><input type="checkbox" value="${p.id }" class="ck"> </td>
					<td>${p.id }</td>
					<td>${p.name }</td>
					<td>${p.amount }</td>
					<td>${p.manager }</td>
					<td>${p.dname }</td>
					<td>
						<a href="show?id=${p.id}" >查看详情</a>
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="15">
					<button name="pageNum" value="1">首页</button>
					<button name="pageNum" value="${pg.prePage==0?1:pg.prePage }">上一页</button>
					<button name="pageNum" value="${pg.nextPage==0?pg.pages:pg.nextPage}">下一页</button>
					<button name="pageNum" value="${pg.pages }">末页</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>

