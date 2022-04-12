<%-- 
    Document   : payment
    Created on : 12 Apr 2022, 13:59:57
    Author     : tresorkl
--%>

<%@page import="za.ac.tut.item.Item"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CART</title>
        <style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}

#price{
  font-family: sans-serif;
  font-size: 25px;  
    
}
#payBtn{
  font-family: sans-serif;
  font-size: 25px; 
  color: white;
  background-color: green;
  border: 0px;
    
}

</style>
        
    </head>
    <body>
        <%
        List<Item> items = (List<Item>)session.getAttribute("items");
        int totAmountDue = (Integer)session.getAttribute("totAmountDue");
        %>
        
        
           
        
 <table>
  <tr>
    <th>PRODUCT NAME</th>
    <th>QUANTITY</th>
    <th>AMOUNT DUE</th>
  </tr>
  <c:forEach items='${sessionScope["items"]}' var ="item">
  <tr>
    <td>${item.getProductName()}</td>
    <td>${item.getQuantity()}</td>
    <td>${item.amountDue()}</td>
  </tr>
  </c:forEach>
   
  
 </table>
        
  <form action="makepayment.do" action="post">
     <h2 id="price" >TOTAL AMOUNT DUE: $<%=totAmountDue%></h2>
     
     <button id="payBtn" type="submit">MAKE PAYMENT</button>
  </form> 
        
        
    
    </body>
</html>
