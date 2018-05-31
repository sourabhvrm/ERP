<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"/>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.10/css/all.css"/>
<link rel="stylesheet" href="decorate.css"/>
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
      
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Finance
        </a>
        <div class="dropdown-menu bg-dark" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item dropdown-dhuvidha" href="companyIncome">Income</a>
          <a class="dropdown-item dropdown-dhuvidha" href="companyProfit">Profit</a>
          <a class="dropdown-item dropdown-dhuvidha" href="companyPageLayout">Expenditures</a>
          <a class="dropdown-item dropdown-dhuvidha" href="companyPageInvestments">Investments</a>
          <a class="dropdown-item dropdown-dhuvidha" href="companyTaxes">Taxes</a>
          <a class="dropdown-item dropdown-dhuvidha" href="companyBalance">Balance</a>
          
        </div>
      </li>
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Projects
        </a>
        <div class="dropdown-menu bg-dark" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item dropdown-dhuvidha" href="companyEmployeesAssigned">Employees Assigned</a>
          <a class="dropdown-item dropdown-dhuvidha" href="companyProPending">Pending</a>
          <a class="dropdown-item dropdown-dhuvidha" href="companyProCompleted">Completed</a>          
        </div>
      </li>
      
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Employees
        </a>
        <div class="dropdown-menu bg-dark" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item dropdown-dhuvidha" href="companyHR">Human Resources</a> 
        </div>
      </li>
      
      
      
      
      <li class="nav-item">
        <a class="nav-link" href="companyGenerateBill">Generate Bill</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="companyUpdateResources">Update Resources</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="companyGrowth">Growth</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="companyFinanceHistory">Finance History</a>
      </li>
      
    </ul>
      
     
      <img src="avatar/avatar1.png" class="img-fluid img-thumbnail mr-2 " style="max-width: 3%;height:auto;"/>
      
      
      
                    <h5 style="color:white;font-weight:lighter;" class="ml-0 mr-5 mt-1"><s:property value="#session.OrgName"/></h5>
      
      
                    <div class="dropleft show">
                <a class="btn btn-dark dropdown-toggle" href="#" role="button" 
                   id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                 <i class="fas fa-angle-left"></i> 
                </a>

                <div class="dropdown-menu bg-dark" aria-labelledby="dropdownMenuLink">
                  <a class="dropdown-item dropdown-dhuvidha" href="OrgLogout">Log Out</a>
                  <a class="dropdown-item dropdown-dhuvidha" href="#">Change Password</a>
                  <a class="dropdown-item dropdown-dhuvidha" href="#">Change Avatar</a>
                </div>
              </div>    
      
  </div>
</nav>



    
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<script>
    $(function(){
       $('.dropdown-toggle').dropdown(); 
    });
    </script>
</body>
</html>