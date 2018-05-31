<%-- 
    Document   : companyIncome
    Created on : 3 May, 2018, 1:58:30 AM
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
        <!--<h1>company Income</h1>
        <form action="companyIncome">
        <select name="year">
            <option value="2015">2015</option>
            <option value="2016">2016</option>
            <option value="2017">2017</option>
            <option value="2018">2018</option>
        </select><br>
        <input type="submit" value="See"/>
        </form>
        <br>
        <s:property value="income"/>-->
        <div class="container">
            <div class="row justify-content-center border-bottom border-warning"><h3 style="font-family:monospace;color:teal;text-decoration:underline;">INCOME</h3>
            </div>
            <div class="row my-5"><form class="form-inline" action="companyIncome">
                    <select name="year" class="form-control">
                        <option value="2015">2015</option>
                        <option value="2016">2016</option>
                        <option value="2017">2017</option>
                        <option value="2018">2018</option>
                    </select>
                    <input type="submit" class="btn-sm btn-dark" value="SEE"/>
                </form></div>
            <div class="row justify-content-center">
                <h5><s:property value="income"/></h5>
            </div>
        </div>
    </body>
</html>
