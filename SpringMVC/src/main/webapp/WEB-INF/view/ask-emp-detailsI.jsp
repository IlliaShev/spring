<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Details</title>
</head>
<body>
    <form:form action="showDetails" modelAttribute="employee">
        Name <form:input path="name"/>
        <form:errors path="name"/>
        <br>
        <br>
        Surname <form:input path="surname"/>
        <form:errors path="surname"/>
        <br>
        <br>
        Salary <form:input path="salary"/>
        <form:errors path="salary"/>
        <br>
        <br>
        Department <form:select path="department">
        <form:options items="${employee.departments}"/>
        </form:select>
        <br>
        <br>
        Which car do you want to buy???
        <br>
        <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
        <br>
        <br>
        Foreign Languages:
        <form:checkboxes path="languages" items="${employee.langList}"/>
        <br>
        <br>
        Number <form:input path="number"/>
        <form:errors path="number"/>
        <br>
        <br>
        Email <form:input path="email"/>
        <form:errors path="email"/>
        <br>
        <br>
        <input type="submit" value="OK">
    </form:form>
</body>
</html>