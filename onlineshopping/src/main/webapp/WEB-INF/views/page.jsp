<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="js" value="/resources/js"></spring:url>
<spring:url var="images" value="/resources/images"></spring:url>

<c:set var="contextRoot" value="${pageContext.request.contextPath }"></c:set>


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>ONline SHOPping -${title}</title>

<script type="text/javascript">
	window.menu = '${title}';
</script>
<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.css" rel="stylesheet">

<!-- Bootstrap Solar Theme CSS -->
<!-- <link href="${css}/bootstrap-solar-theme.css" rel="stylesheet"> -->


<!-- Add custom CSS here -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>
<body>

	<div class="wrapper">
		<!-- Navigation Bar here -->
		<%@include file="./shared/navbar.jsp"%>

		<div class="content">
			<!--  Home Page comes here -->
			<c:if test="${userClickHome == true }">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- Load only when user click about -->
			<c:if test="${userClickAbout == true }">
				<%@include file="about.jsp"%>
			</c:if>

			<!--  load only when user click contact -->
			<c:if test="${userClickContact == true }">
				<%@include file="contact.jsp"%>
			</c:if>
		</div>

		<!-- Footer comes here -->
		<%@include file="./shared/footer.jsp"%>


		<!-- JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.js"></script>
		<script src="${js}/myapp.js"></script>

	</div>
</body>
</html>
