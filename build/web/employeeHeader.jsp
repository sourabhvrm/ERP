<%-- 
    Document   : employeeHeader
    Created on : 3 May, 2018, 12:28:02 AM
    Author     : prince
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#" style="font-family: verdana;">Risorsa</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">

                    <li class="nav-item active">
                        <a class="nav-link" href="MainPageLayout">Home <span class="sr-only">(current)</span></a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="employeePageLayout">PaySlip</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="employeePagePersonalInfo">Personal Info</a>
                    </li>


                    <li class="nav-item">
                        <a class="nav-link" href="employeePageProjectsAssigned">Projects Assigned</a>
                    </li>



                </ul>
                <!--
                <div class="container">
                <img src="./images/kd.jpg" class="img-fluid img-thumbnail" alt="Responsive image" style="max-width: 100%;height: auto;"/>
                </div>
                -->

                <img src="avatar/avatar1.png" class="img-fluid img-thumbnail mr-2 " style="max-width: 3%;height:auto;"/>



                <h5 style="color:white;font-weight:lighter;" class="ml-0 mr-5 mt-1"><s:property value="#session.empName"/></h5>


                <div class="dropleft show">
                    <a class="btn btn-dark dropdown-toggle" href="#" role="button" 
                       id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-angle-left"></i> 
                    </a>

                    <div class="dropdown-menu bg-dark" aria-labelledby="dropdownMenuLink">
                        <a class="dropdown-item dropdown-dhuvidha" href="EmpLogout">Log Out</a>
                        <a class="dropdown-item dropdown-dhuvidha" href="#">Change Password</a>
                        <a class="dropdown-item dropdown-dhuvidha" href="#">Change Avatar</a>
                    </div>
                </div>    
            </div>
        </nav>

    </body>
</html>
