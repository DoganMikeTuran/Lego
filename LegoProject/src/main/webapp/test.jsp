<%-- 
    Document   : test
    Created on : 16-Oct-2018, 12:38:37
    Author     : dmt1
--%>

<%@include file="Layout/Header.jsp" %>


<ul class="list-group">
  <li class="list-group-item"><%out.println("Your role: "+user.getRole());%></li>
  <li class="list-group-item"><%out.println("Your password: "+user.getPassword());%> </li>
  <li class="list-group-item"><% out.println("Your Id: "+user.getId());%></li>
  <li class="list-group-item"><% out.println("Your Email: "+user.getEmail());%></li>
</ul>

  






<%@include file="Layout/Footer.jsp" %>
