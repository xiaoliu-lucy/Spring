<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student - Confirmation</title>
	</head>
	<body>
		Student is confirmed: ${student.firstName} ${student.lastName} from ${student.country}
		<br/><br/>
		Favorite Language: ${student.favoritePL}
		<br/><br/>
		Operating System: 
		<ul>
			<c:forEach var="temp" items="${student.ops}">
				<li>${temp}</li>
			</c:forEach>
		</ul>
	</body>

</html>