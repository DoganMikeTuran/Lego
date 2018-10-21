<%-- 
    Document   : Order
    Created on : 16-Oct-2018, 15:28:02
    Author     : dmt1
--%>

<%@page import="FunctionLayer.Ordre"%>
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

    <%        Ordre o = (Ordre) session.getAttribute("order");
    %>

    <form name="order" action="FrontController" method="POST">
        <input type='hidden' name="command" value="ordre-show-stykliste"/>
        Højde: <input type="number" name="layer" value='<%=(o != null ? o.getHøjde() : "")%>' placeholder="indtast højde" required/>   
        <br>
        Bredde: <input type="number" name="width" value='<%=(o != null ? o.getBredde() : "")%>' placeholder="indtast bredde" required/>   
        <br>
        Længde: <input type="number" name="length" value='<%=(o != null ? o.getLængde() : "")%>' placeholder="indtast længde" required/>   
        <br>
        <input <%=(o != null ? "disabled" : "")%> type='submit' name='submit' value="Opret stykliste"/>       
    </form>

    <hr/>

    <%

        if (o != null) {%>

    <div id='styklisteDiv' style='display:block;'>
        <h1>Stykliste</h1>
        Her kan du se stykliste på din ordre med ordrenummer: <%=o.getOrdreNummer()%> <br>
        Din ordre har følgende status: <%=(o.getStatus() != null ? o.getStatus() : "") %>

        <table style="width:60%">
            <tr>
                <th>Sidenavn</th>
                <th>2x4</th>
                <th>2x2</th>
                <th>1x2</th>
            </tr>

            <%
                if (o.getStykliste() != null) {
                    for (int i = 0; i < o.getStykliste().getSider().size(); i++) {%>

            <tr>
                <td><%= o.getStykliste().getSider().get(i).getSideNavn()%></td>
                <td><%= o.getStykliste().getSider().get(i).getToGangeFire()%></td>
                <td><%= o.getStykliste().getSider().get(i).getToGangeTo()%></td>
                <td><%= o.getStykliste().getSider().get(i).getEnGangeTo()%></td>
            </tr>

            <%
                }
            %>
            <br>
            <tr> 
            <th>Total</th>
            <td><%=o.getStykliste().getToGangeFireTotal()%></td>
            <td><%=o.getStykliste().getToGangeToTotal()%></td>
            <td><%=o.getStykliste().getToGangeEnTotal()%></td>
            </tr>
            <br>   
            <tr>
            <th>X Højde</th>
            <td><%=o.getStykliste().getToGangeFireTotalXHøjde()%></td>
            <td><%=o.getStykliste().getToGangeToTotalXHøjde()%></td>
            <td><%=o.getStykliste().getToGangeEnTotalXHøjde()%></td>
            </tr>
            <%
                    }
                }
            %>

        </table>

        <form name="order" action="FrontController" method="POST">
            <input type='hidden' name="command" value="bestil-ordre"/>
            <input type='submit' name='submit' value="Bestil ordre"/>       
        </form>
        <hr/>

    </div>


</div>
<%@include file="Layout/Footer.jsp" %>
