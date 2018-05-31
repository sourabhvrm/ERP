<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
</head>
<body>
<s:actionerror/>
        <s:div class="container-fluid">
            <s:div class="container">
                <s:div class="row">
                    <div class="col-md-6 text-center">
                        <form name="CreateOrg" action="signup_org" method="POST">
                            <s:div class="form-group">
                                <input type="text" class="form-control" name="orgName" id="orgName" placeholder="Enter Organizataion Name">
                            </s:div>
                            <br>
                            <s:div class="form-group">
                                <input type="text" class="form-control" name="location" id="orgLoc" placeholder="Enter Organization Location">
                            </s:div>
                            <br>
                            <s:div class="form-group">
                                <input type="text" class="form-control" name="dateCreated" id="orgDate" placeholder="Enter Organization Start Time">
                            </s:div>
                            <s:div class="form-group">
                                <input type="password" class="form-control" name="orgPassword" id="password" placeholder="Password">
                            </s:div>
                            <s:div class="form-group">
                                <input type="password" class="form-control" name="cnfPassword" id="cnfPassword" placeholder="Confirm Password">
                            </s:div>
                            <br>
                            <button value="SignUp" class="btn btn-primary">LogIn</button>
                        </form>
                    </div>
                </s:div>
            </s:div>
        </s:div>
</body>
</html>