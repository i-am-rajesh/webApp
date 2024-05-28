<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>
    <h2>Registration Form</h2>
    <form:form action="${pageContext.request.contextPath}/register" modelAttribute="register" method="post">
        First Name: <form:input path="firstName"/><br/>
        Last Name: <form:input path="lastName"/><br/>
        Number: <form:input path="number"/><br/>
        Email: <form:input path="email"/><br/>
        Date of Birth: <form:input path="dob"/><br/>
        Gender: <form:input path="gender"/><br/>
        Address: <form:input path="address"/><br/>
        City: <form:input path="city"/><br/>
        Zip: <form:input path="zip"/><br/>
        Password: <form:password path="password"/><br/>
        Confirm Password: <form:password path="confirmPassword"/><br/>
        <input type="submit" value="Register"/>
    </form:form>
</body>
</html>
