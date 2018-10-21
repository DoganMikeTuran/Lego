<%-- 
    Document   : Profile
    Created on : 16-Oct-2018, 15:32:36
    Author     : dmt1
--%>

<%@page import="sun.java2d.pipe.OutlineTextRenderer"%>
<%@include file="Layout/Header.jsp" %>
<div>
    <div style="background-color: activeborder">
        <ul class="nav nav-pills justify-content-end">
            <li class="nav-item">
                <a class="nav-link " href="customerpage.jsp">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Order.jsp">Make Order</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Recent.jsp">Recent orders</a>
            </li>
            <li class="nav-item">
                <a class="nav-link active" href="Profile.jsp">View profile</a>
            </li>
        </ul>

    </div>  
    <table class="table table-sm table-dark">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">ID</th>
      <th scope="col">Email</th>
      <th scope="col">Password</th>
      <th scope="col">Role</th>
      
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">INFO</th>
      <td><% out.println(user.getId()); %></td>
      <td><% out.println(user.getEmail()); %></td>
      <td><% out.println(user.getPassword()); %></td>
      <td><% out.println(user.getRole()); %></td>
      
      
    </tr>
    
    
  </tbody>
</table>
   
   
</div>

<%@include file="Layout/Footer.jsp" %>
