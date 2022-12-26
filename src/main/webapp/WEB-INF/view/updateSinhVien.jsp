<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <%--    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">--%>
    <title>Insert title here</title>
</head>
<body >

<div class="container mt-3">

    <h1>Edit Sinh Vien Form</h1>
    <form action="updateSinhVien" method="POST" modelAttribute="sinhVien">

        <div class="row">
            <div class="col">
                <div class="form-group">
                    <label for="id">Id</label> <input type="text"
                                                      value="${sinhVien.maSinhVien}" class="form-control" id="id" name="maSinhVien"
                                                     >
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col">
                <div class="form-group">
                    <label for="name">Name</label>
                    <input class="form-control" id="name" name="tenSinhVien"
                           placeholder="Enter name"> ${sinhVien.tenSinhVien } </input>
                </div>
            </div>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>

</div>
</body>

</html>