<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Apartment Floor</title>
</head>
<body>
    <h2>Add Apartment Floor</h2>
    <form:form method="post" action="addApartmentFloor" modelAttribute="apartmentFloorDTO" enctype="multipart/form-data">
        <table>
            <tr>
                <td>Project ID:</td>
                <td><form:input path="projid" /></td>
            </tr>
            <tr>
                <td>Apartment ID:</td>
                <td><form:input path="aprtid" /></td>
            </tr>
            <tr>
                <td>Floor Index:</td>
                <td><form:input path="aprtfloorindex" /></td>
            </tr>
            <tr>
                <td>Completion Status:</td>
                <td><form:input path="aprtcompletionstatus" /></td>
            </tr>
            <tr>
                <td>Floor Plan:</td>
                <td><input type="file" name="aprtfloorplan" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Submit" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
