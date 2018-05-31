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
    <s:actionmessage/>
    <div class="container">
        <div class="row justify-content-center border-bottom border-warning">
            <h3 style="font-family:monospace;color:teal;text-decoration:underline;">UPDATE RESOURCES</h3></div>
            <div class="row my-5 border-bottom border-dark" style="width:15%;">Available Departments</div>
            <div class="row my-5">
                <ul class="list-group border border-success">
                <s:iterator value="list_dept">
                    <li class="list-group-item" style="color:purple;"><s:property/></li>
                </s:iterator>
                </ul>
            </div>
            <div class="row my-5 border-bottom border-dark" style="width:12%;">Add Department</div>
            
            <div class="row">
                <form class="form-inline" method="post" action="companyAddDept">
                    <input type="text" class="form-control" name="Dept_name" placeholder="Department Name"/>
                    <input type="submit" value="ADD Department" class="form-control btn-sm btn-dark"/>
                </form>
            </div>
            
            <div class="row my-5 border-bottom border-dark" style="width:12%;">Add Project</div>
            
            <div class="row">
                <form class="form-inline" method="post" action="companyAddProject">
                    <input type="text" class="form-control" name="project_name" placeholder="Project Name"/>
                    <input type="submit" value="ADD Project" class="form-control btn-sm btn-dark"/>
                </form>
            </div>
            
            
            <div class="row my-5 border-bottom border-dark" style="width:12%;">Assign Project</div>
            
            <div class="row">
                <form class="form-inline" method="post" action="companyAssignProject">
                    <input type="text" class="form-control" name="emp_email" placeholder="Enter Employee EmailID"/>
                    <input type="text" class="form-control" name="project_assigned" placeholder="Enter Project Name"/>
                    <input type="submit" value="Asign Project" class="form-control btn-sm btn-dark"/>
                </form>
            </div>
            
            
            <div class="row my-5 border-bottom border-dark" style="width:12%;">ADD Transaction</div>
            
            <div class="row">
                <form class="form-inline" method="post" action="companyAddTransaction">
                    <select name="transtype" class="form-control">
                        <option value="invest">Investment</option>
                        <option value="expend">Expenditure</option>
                        <option value="income">Income</option>
                    </select>
                    <input type="text" class="form-control" name="transamount" placeholder="Enter Amount"/>
                    <input type="text" class="form-control" name="transDate" placeholder="Enter Date"/>
                    <input type="text" class="form-control" name="transYear" placeholder="Enter Year"/>
                    <input type="submit" value="Add Transaction" class="form-control btn-sm btn-dark"/>
                </form>
            </div>
            
            
            
    </div>
    <!--
    <s:div cssClass="container"><h3>Update Resources</h3></s:div><br>

                    <ul>
                <s:iterator value="list_dept"> 
                    
                    <li><s:property/></li>
                    
                </s:iterator>
                        </ul>

<br>
                        <form method="POST" action="companyAddDept">
                            <s:div class="form-group">
                                <label for="empEmail">Dept_Name</label>
                                <input type="text" class="form-control" name="Dept_name" id="empId" placeholder="Enter Department name">
                            </s:div>
                            <button value="LogIn" class="btn btn-primary">Add Department</button>
                        </form>


<br><h6>Add Project</h6>

<form method="POST" action="companyAddProject">
                                <s:div class="form-group">
                                <label for="Project_name">Project_Name</label>
                                <input type="text" class="form-control" name="project_name" id="empId" placeholder="Enter Project name">
                            </s:div>
                            <button value="LogIn" class="btn btn-primary">Add Project</button>
                        </form>



<br><h6>Assign Project</h6>

                        <form method="POST" action="companyAssignProject">
                            <s:div class="form-group">
                                <label for="empEmail">Employee Email</label>
                                <input type="text" class="form-control" name="emp_email" id="empId" placeholder="Enter Employee email">
                            </s:div>
                                <s:div class="form-group">
                                <label for="project_assigned">project_Name</label>
                                <input type="text" class="form-control" name="project_assigned" id="empId" placeholder="Enter project name">
                            </s:div>
                            <button value="LogIn" class="btn btn-primary">Assign Project</button>
                        </form>

<br><h6>Add Transaction</h6>

                    <form method="POST" action="companyAddTransaction">
                            <s:div class="form-group">
                                <label for="Type">Type</label>
                                <input type="text" class="form-control" name="transtype" id="empId" placeholder="Type">
                            </s:div>
                                <s:div class="form-group">
                                <label for="amount">Amount</label>
                                <input type="text" class="form-control" name="transamount" id="empId" placeholder="amount">
                            </s:div>
                                
                                
                            <s:div class="form-group">
                                <label for="Date">Date</label>
                                <input type="text" class="form-control" name="transDate" id="empId" placeholder="Enter Date">
                            </s:div>
                                <s:div class="form-group">
                                <label for="Year">Year</label>
                                <input type="text" class="form-control" name="transYear" id="empId" placeholder="Enter Year">
                            </s:div>    
                                
                            <button value="LogIn" class="btn btn-primary">ADD Transactions</button>
                        </form>



-->
</body>
</html>