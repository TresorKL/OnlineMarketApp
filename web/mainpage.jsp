<%-- 
    Document   : mainpage
    Created on : 12 Apr 2022, 14:24:45
    Author     : tresorkl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
    <style media="screen">
    body{
    font-family: sans-serif;
    }
      #quantity{
         background-color: #C0CBC6;
        height: 40px;
        width:25%


      }
      #addBtn{
        border: 0px;
        height: 44px;
        width:50%;
        background-color: #009B2E;
        color: white;
      }
      #paymentBtn{
        border: 0px;
        height: 44px;
        width:85%;
        background-color: blue;
        color: white;
      }
      ul{

      display:grid;
      align-items: center;
      justify-content: center;

      }
      
      ul>li{
          list-style-type:none;
      }
    </style>
  </head>
  <body>
     <ul>
         
         <li>
             
         <form class="" action="PaymentServlet.do" method="post">
         
         <button id="paymentBtn" type="submit" >MAKE PAYMENT</button>
         </form>
             
         </li>
      <li>
      <form class="" action="CartServlet.do" method="post">
        <h2>AIRNIKE $50</h2>
        <input id="quantity" type="number" name="quantity" >
          <button id="addBtn" type="submit" name="product" value="AIRNIKE">ADD TO CART</button>
      </form>
      </li>
      <li>
      <form class="" action="CartServlet.do" method="post">
        <h2 >JORDAN $150</h2>
        <input id="quantity" type="number" name="quantity" >

        <button id="addBtn" type="submit" name="product" value="JORDAIN">ADD TO CART</button>
      </form>
      </li>
      <li>
      <form class="" action="CartServlet.do" method="post">
        <h2  >VERSACE $80</h2>
        <input id="quantity" type="number" name="quantity" >
        <button id="addBtn" type="submit" name="product" value="VERSACE">ADD TO CART</button>
      </form>
      </li>
      <li>
      <form class="" action="CartServlet.do" method="post">
        <h2  >BALANCIAGA $250</h2>
        <input id="quantity" type="number" name="quantity" >
        <button id="addBtn" type="submit" name="product" value="BALANCIAGA">ADD TO CART</button>
      </form>
      </li>

     </ul>
  </body>
</html>

