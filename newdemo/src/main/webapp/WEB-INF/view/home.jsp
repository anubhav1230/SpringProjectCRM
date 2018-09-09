<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>

<html>

<head>
<title>luv2code Company Home Page</title>
</head>

<body>
	<h2>luv2code Company Home Page</h2>
	<hr>

	<p>Welcome to the luv2code company home page!</p>
	<hr>
	<p>
		<!--Display username and password  -->

		Users:
		<security:authentication property="principal.username" />
		<br> <br> Roles:
		<security:authentication property="principal.authorities" />

	</p>
	<hr>

	<hr>

	<security:authorize access="hasRole('MANAGER')">
		<p>
			<a href="${pageContext.request.contextPath}/leaders">Leaders</a>
			(Only for leaders)

		</p>
	</security:authorize>

	<hr>


	<security:authorize access="hasRole('ADMIN')">
		<p>
			<a href="${pageContext.request.contextPath }/systems">Admin</a> (Only
			for admins)

		</p>
	</security:authorize>
	<!-- Add a logout button -->
	
	<form:form action="${pageContext.request.contextPath}/logout"
		method="POST">

		<input type="submit" value="Logout" />


	</form:form>

</body>

</html>









