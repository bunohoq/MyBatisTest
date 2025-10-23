<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="http://bit.ly/3WJ5ilK" />
</head>
<body class="wide">
	
	<!-- result.jsp -->
	<h1>쿼리 결과</h1>
	
	<div>result: ${result}</div>

	<div>name: ${name}</div>

	<div>dto: ${dto}</div>
	
	<hr>
	
	<c:forEach items="${alist}" var="adto">
		<div>
			${adto}
		</div>
	</c:forEach>
	
</body>
</html>
