<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Student - Input Form</title>
	</head>
	<body>
	<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName" />
	<br/><br/>
	Last name: <form:input path="lastName" />
	<br/><br/>
	<form:select path="country">
		<form:options items="${student.countryOption}" />
	<!--  
	<form:option value="China" label="China"/>
	<form:option value="USA" label="USA"/>
	<form:option value="UK" label="UK"/>
	<form:option value="Japan" label="Japan"/>
	-->
	</form:select>
	<br/><br/>
	Favorite Language:
	Java <form:radiobutton path="favoritePL" value="Java" />
	C# <form:radiobutton path="favoritePL" value="C#" />
	Python <form:radiobutton path="favoritePL" value="Python" />
	Ruby <form:radiobutton path="favoritePL" value="Ruby" />
	<br/><br/>
	Operationg Systems:
	Windows <form:checkbox path="Ops" value="Windows" />
	Linux <form:checkbox path="Ops" value="Linux" />
	Mac OS <form:checkbox path="Ops" value="Max Os" />
	
	<br/><br/>
	<input type="submit" value = "Submit" />
	</form:form>




	</body>

</html>