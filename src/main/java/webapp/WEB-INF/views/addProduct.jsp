<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="/WEB-INF/views/template/header.jsp"%>


<div class="container-wrapper">
    <div class="container">

        <div class="page-header">
            <h1>Add Products</h1>
            <p class="lead">Fill the below information to add a product</p>
        </div>

        <%--the commandName here is the object name, this product object will be sent to controller as a modelAttribute--%>
        <form:form action="${pageContext.request.contextPath}/admin/productInventory/addProduct" method="post" commandName="product">

            <div class="form-group">
                <label for="name">Name</label>
                <form:input path="productName" id="name" class="form-Control"/>
            </div>

            <div class="form-group">
                <label for="category">Category</label>
                <label class="checkbox-inline">
                    <form:radiobutton path="productCategory" id="category" value="instrument"/>Instrument
                </label>
                <label class="checkbox-inline">
                    <form:radiobutton path="productCategory" id="category" value="record"/>Record
                </label>
                <label class="checkbox-inline">
                    <form:radiobutton path="productCategory" id="category" value="accessory"/>Accessory
                </label>
            </div>

            <div class="form-group">
                <label for="description">Description</label>
                <form:textarea path="productDescription" id="description" class="form-Control"/>
            </div>

            <div class="form-group">
                <label for="price">Price</label>
                <form:input path="productPrice" id="price" class="form-Control"/>
            </div>

            <div class="form-group">
                <label for="condition">Condition</label>
                <label class="checkbox-inline">
                    <form:radiobutton path="productCondition" id="condition" value="new"/>New
                </label>
                <label class="checkbox-inline">
                    <form:radiobutton path="productCondition" id="condition" value="used"/>Used
                </label>
            </div>

            <div class="form-group">
                <label for="status">Status</label>
                <label class="checkbox-inline">
                    <form:radiobutton path="productStatus" id="status" value="active"/>Active
                </label>
                <label class="checkbox-inline">
                    <form:radiobutton path="productStatus" id="status" value="inactive"/>Inactive
                </label>
            </div>

            <div class="form-group">
                <label for="unitInStock">UnitInStock</label>
                <form:input path="unitInStock" id="unitInStock" class="form-Control"/>
            </div>

            <div class="form-group">
                <label for="manufacturer">Manufacturer</label>
                <form:input path="productManufacturers" id="manufacturer" class="form-Control"/>
            </div>

            <br><br>

            <input type="submit" value="Submit" class="btn btn-success"/>
            <a href="<c:url value="/admin/productInventory"/> " class="btn btn-danger">Cancel</a>
        </form:form>

        <%@include file="/WEB-INF/views/template/footer.jsp"%>

