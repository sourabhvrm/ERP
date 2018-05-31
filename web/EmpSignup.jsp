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
    <s:div class="container-fluid">
            <s:div class="container">
                <h3>ERP</h3>
                <s:actionerror/>
                <s:div class="row">
                    <div class="col-md-6 text-center form-container">
                        <form method="POST"action="signup_the_emp">
                            
                            <s:div class="form-group">
                                <input type="text" class="form-control" name="empName" id="name" placeholder="Enter Employee Name">
                            </s:div>
                            <s:div class="form-group">
                                <input type="email" class="form-control" name="empEmailId" id="emailId" placeholder="Enter Email Id" onfocus="populate()">
                            </s:div>
                            <s:div class="form-group">
                                <input type="number" class="form-control" name="empOrgCode" placeholder="Enter Organization ID"/>
                            </s:div>
                            <s:div class="form-group">
                                <label class="radio-inline"><input type="radio" class="form-control" name="empGender"  id="gender" value="M" checked >Male</label>
                                <label class="radio-inline"><input type="radio" class="form-control" name="empGender" id="gender" value="F" >Female</label>
                                </s:div>
                                <s:div class="form-group">
                                <input type="number" class="form-control" name="mobNo" id="mobNo" placeholder="Mobile No">
                            </s:div>
                            <s:div class="form-group">
                                <input type="text" class="form-control" name="empAddress" id="address" placeholder="Address">
                            </s:div>
                            <s:div class="form-group">
                                <input type="text" class="form-control" name="empDeptName" id="deptName" placeholder="Dept Name">
                            </s:div>
                            <s:div class="form-group">
                                <input type="text" class="form-control" name="empJoiningDate" id="joiningDate" placeholder="Joining Date">
                            </s:div>
                            <s:div class="form-group">
                                <input type="password" class="form-control" name="empPassword" id="password" placeholder="Password">
                            </s:div>
                            <s:div class="form-group">
                                <input type="password" class="form-control" name="cnfPassword" id="cnfPassword" placeholder="Confirm Password">
                            </s:div>
                            <s:submit value="Sign Up" class="btn btn-primary"></s:submit>
                            </form>
                        </div>
                </s:div>
            </s:div>
        </s:div>
</body>
</html>