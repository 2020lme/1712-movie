<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title><link href="/resource/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
</head>
<body>

	<table>
		<tr>
			<td>编号</td>
			<td>商铺名称</td>
			<td>创建日期</td>
			<td>销售的商品</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${shopList }" var="a">
			<tr>
				<td>${a.sid }</td>
				<td>${a.sname }</td>
				<td>${a.creat }</td>
				<td>
					<c:forEach ${a.goods } var="b">
						${b.gname }
					</c:forEach>
				</td>
				<td>
					<input type="button" value="详情" onclick="xq()">
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>