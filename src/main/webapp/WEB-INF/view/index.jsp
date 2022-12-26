<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body >
<div class="container mt-3">

    <h1>Add Sinh vien Form</h1>
    <a href="addSinhVien" class="btn btn-primary"> Add Sinh Vien </a>
    <div class="row">
        <p>${data} hello</p>
        <table class="table table-hover">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Name</th>
            </tr>

            </thead>

            <tbody>
            <c:forEach var="sinhVien" items="${data}">
                <tr>
                    <td class="table-plus">${sinhVien.maSinhVien} </td>
                    <td>${sinhVien.tenSinhVien}</td>
                    <td><a href="editSinhVien/${sinhVien.maSinhVien}" class="btn btn-warning">
                        Edit </a></td>
                    <td><a href="deleteSinhVien/${sinhVien.maSinhVien}"
                           class="btn btn-danger"> Delete </a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script >
    function loadData() {
        $.ajax({
            type: "GET", contentType: "application/json", url: "/api", success: function (responseData) {
                console.log(responseData)
            }, error: function (e) {
                console.log("ERROR : ", e);
            }
        });
    }
    loadData()

</script>
</body>

</html>