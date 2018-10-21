<%-- 
    Document   : Order
    Created on : 16-Oct-2018, 15:28:02
    Author     : dmt1
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.Wall"%>
<%@include file="Layout/Header.jsp" %>
<div>
    
    <div style="background-color: activeborder">
        <ul class="nav nav-pills justify-content-end">
            <li class="nav-item">
                <a class="nav-link " href="customerpage.jsp">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link active" href="Order.jsp">Make Order</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Recent.jsp">Recent orders</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Profile.jsp">View profile</a>
            </li>
        </ul>

    </div>  
    <form name="order" action="FrontController" method="POST">
        <input type='hidden' name="command" value="orderList"/>
        <input type="number" name="layer" placeholder="indtast højde" required/>   
        <br>
        <input type="number" name="width" placeholder="indtast bredde" required/>   
        <br>
        <input type="number" name="length" placeholder="indtast længde" required/>   
        <input type='submit' name='submit' value="opret stykliste"/>       
    </form>
    
    
 <% 
    

    ArrayList<Wall> walls = (ArrayList<Wall>)request.getSession().getAttribute("order");
    if(walls!=null){
 
    for(Wall wall : walls)
    {

      
        out.print(wall.getBrick1());

 
    }
 }
%>  
</div>
<%@include file="Layout/Footer.jsp" %>
