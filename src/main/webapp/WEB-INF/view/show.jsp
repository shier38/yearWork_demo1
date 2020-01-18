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
</head>
<body>
<h1 align="center" style="font-size: 30px">投资项目详情</h1>
	<form:form  action="update" method="post" modelAttribute="p">
		<form:hidden path="id"/>
		项目名称：<form:input path="name"  style="width:300px"/><br>
		投资金额：<form:input path="amount" /><br>
		分管领导：<form:input path="manager" /><br>
		所属部门：
			<form:select path="dept_id">
			<c:forEach items="${dlist }" var="d">
				<form:option value="${d.id}">${d.name }</form:option>
			</c:forEach>
			</form:select>
		<br>
		项目说明：<br><form:textarea path="content" style="height:90px;width:500px" /><br>
		<a href="list"><input type="button" value="返回" style="height: 30px;width: 60px"></a>
		<button style="height: 30px;width: 60px">修改</button>
	</form:form>
</body>
</html>

