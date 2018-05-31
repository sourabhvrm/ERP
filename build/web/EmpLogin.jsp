<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
        <s:actionerror/>
        <s:div class="container-fluid">
            <s:div class="container">
                <h3>ERP</h3>
                <s:div class="row">
                    <div class="col-md-6 text-center">
                        <form method="POST" action="login_the_emp">
                            <s:div class="form-group">
                                <label for="empEmail">Employee Email</label>
                                <input type="text" class="form-control" name="empEmailId" id="empId" placeholder="Enter Employee Id">
                            </s:div>
                            <s:div class="form-group">
                                <label for="password">Password</label>
                                <input type="password" class="form-control" name="password" id="password" placeholder="Enter Password">
                            </s:div>
                            <button value="LogIn" class="btn btn-primary">LogIn</button>
                        </form>
                    </div>
                </s:div>
            </s:div>
        </s:div>


    </body>
</html>