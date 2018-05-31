<%-- 
    Document   : employeePagePersonalInfo
    Created on : 7 May, 2018, 3:36:10 AM
    Author     : prince
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <!-- <h1>Personal Infp</h1><br>
        <s:property value="name"/><br>
        <s:property value="email"/><br>
        <s:property value="Phone"/><br>
        <s:property value="sex"/><br>
        <s:property value="address"/><br>
        <s:property value="Joining_date"/><br>
    </body>-->
        
        <div class="container">
            <div class="row justify-content-center border-bottom border-warning"><h3 style="font-family:monospace;color:teal;text-decoration:underline;">PERSONAL INFO</h3>
            </div>
           <div class="container justify-content-center my-5" style="width: 60%;">
               <div class="row my-2 justify-content-center"><div class="col-3"></div><div class="col-3">Name</div><div class="col-1 "> - </div><div class="col-5"><small><s:property value="name"/></small></div></div>
               <div class="row my-2 justify-content-center"><div class="col-3"></div><div class="col-3">Email</div><div class="col-1 "> - </div><div class="col-5"><small><s:property value="email"/></small></div></div>
               <div class="row my-2 justify-content-center"><div class="col-3"></div><div class="col-3">Phone</div><div class="col-1"> - </div><div class="col-5"><small><s:property value="Phone"/></small></div></div>
               <div class="row my-2 justify-content-center"><div class="col-3"></div><div class="col-3">Gender</div><div class="col-1"> - </div><div class="col-5"><small><s:property value="sex"/></small></div></div>
               <div class="row my-2 justify-content-center"><div class="col-3"></div><div class="col-3">Address</div><div class="col-1"> - </div><div class="col-5"><small><s:property value="address"/></small></div></div>
               <div class="row my-2 justify-content-center"><div class="col-3"></div><div class="col-3">Joining Date</div><div class="col-1"> - </div><div class="col-5"><small><s:property value="Joining_date"/></small></div></div>
           </div>
        </div>
        
</html>
