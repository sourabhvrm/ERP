<%-- 
    Document   : companyProfit
    Created on : 3 May, 2018, 1:57:44 AM
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
     <!--   <h1>company Profit</h1>
        
        <form action="companyProfit">
        <select name="year">
            <option value="2015">2015</option>
            <option value="2016">2016</option>
            <option value="2017">2017</option>
            <option value="2018">2018</option>
        </select><br>
        <input type="submit" value="See"/>
        </form>
        <br>
        <s:property value="Profit"/>-->
        
        <div class="container">
            <div class="row justify-content-center border-bottom border-warning"><h3 style="font-family:monospace;color:teal;text-decoration:underline;">PROFIT</h3>
            </div>
            <div class="row my-5"><form class="form-inline" action="companyProfit">
                    <select name="year" class="form-control">
                        <option value="2015">2015</option>
                        <option value="2016">2016</option>
                        <option value="2017">2017</option>
                        <option value="2018">2018</option>
                    </select>
                    <input type="submit" class="btn-sm btn-dark" value="SEE"/>
                </form></div>
            <div class="row justify-content-center">
                <h5><s:property value="Profit"/></h5>
            </div>
        </div>
    </body>
</html>
