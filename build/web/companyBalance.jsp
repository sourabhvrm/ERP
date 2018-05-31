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
<!--<s:div cssClass="container"><h3>Balance</h3></s:div>
<br> 
       <s:property value="income"/>
       <br><s:property value="expend"/>
       <br><s:property value="invest"/>
       <br><s:property value="Profit"/>
       <br><s:property value="Tax"/>-->
       
       <div class="container">
            <div class="row justify-content-center border-bottom border-warning"><h3 style="font-family:monospace;color:teal;text-decoration:underline;">BALANCE</h3>
            </div>
           <div class="row my-5 justify-content-center">YEAR-2018</div>
           <div class="container justify-content-center" style="width: 60%;">
               <div class="row my-2 justify-content-center"><div class="col-3"></div><div class="col-3">Income</div><div class="col-1 "> - </div><div class="col-5"><small><s:property value="income"/></small></div></div>
               <div class="row my-2 justify-content-center"><div class="col-3"></div><div class="col-3">Expenditure</div><div class="col-1 "> - </div><div class="col-5"><small><s:property value="expend"/></small></div></div>
               <div class="row my-2 justify-content-center"><div class="col-3"></div><div class="col-3">Invest</div><div class="col-1"> - </div><div class="col-5"><small><s:property value="invest"/></small></div></div>
               <div class="row my-2 justify-content-center"><div class="col-3"></div><div class="col-3">Profit</div><div class="col-1"> - </div><div class="col-5"><small><s:property value="Profit"/></small></div></div>
               <div class="row my-2 justify-content-center"><div class="col-3"></div><div class="col-3">Tax</div><div class="col-1"> - </div><div class="col-5"><small><s:property value="Tax"/></small></div></div>
           </div>
        </div>
       
       
</body>
</html>