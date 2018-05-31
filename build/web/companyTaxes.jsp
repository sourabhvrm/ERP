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
<!--<s:div cssClass="container"><h3>Taxes</h3></s:div>
<br>
 <form action="companyTaxes">
        <select name="year">
            <option value="2015">2015</option>
            <option value="2016">2016</option>
            <option value="2017">2017</option>
            <option value="2018">2018</option>
        </select><br>
        <input type="submit" value="See"/>
        </form>
        <br>
        <s:property value="Tax"/>-->
        
        <div class="container">
            <div class="row justify-content-center border-bottom border-warning"><h3 style="font-family:monospace;color:teal;text-decoration:underline;">TAX</h3>
            </div>
            <div class="row my-5"><form class="form-inline" action="companyTaxes">
                    <select name="year" class="form-control">
                        <option value="2015">2015</option>
                        <option value="2016">2016</option>
                        <option value="2017">2017</option>
                        <option value="2018">2018</option>
                    </select>
                    <input type="submit" class="btn-sm btn-dark" value="SEE"/>
                </form></div>
            <div class="row justify-content-center">
                <h5><s:property value="Tax"/></h5>
            </div>
        </div>
</body>
</html>