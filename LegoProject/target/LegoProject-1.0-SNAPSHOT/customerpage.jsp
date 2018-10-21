<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>

<%@include file="Layout/Header.jsp" %>


<div>

    <div style="background-color: activeborder">
        <ul class="nav justify-content-end">
            <li class="nav-pills">
                <a class="nav-link active" href="customerpage.jsp">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Order.jsp">Make Order</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Recent.jsp">Recent orders</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Profile.jsp">View profile</a>
            </li>
        </ul>

    </div>  
    <div class="row" >
        <div class="col-sm-12" >
            <img src="http://getwallpapers.com/wallpaper/full/3/8/c/188392.jpg" class="img-fluid" alt="Responsive image">
        </div>
        

            
            

        </div>

    </div>
    <div class="card-group">
  <div class="card">
      <img class="card-img-top" src="http://getwallpapers.com/wallpaper/full/5/c/d/432724.jpg" alt="Card image cap" height="255" width="255">
    <div class="card-body">
      <h5 class="card-title">Make order</h5>
      <p class="card-text">In "Make Order" you'll be able to form your own Lego-House, you need a length, width and the amount of layers</p>
      <a href="Order.jsp"> Make order</a>
    </div>
  </div>
  <div class="card">
    <img class="card-img-top" src="http://getwallpapers.com/wallpaper/full/f/4/9/432634.jpg" alt="Card image cap" height="255" width="255">
    <div class="card-body">
      <h5 class="card-title">Recent orders</h5>
      <p class="card-text">In "Recent orders" you'll be able to see your recent orders </p>
      <a href="Recent.jsp"> Recent orders </a>
    </div>
  </div>
  <div class="card">
    <img class="card-img-top" src="http://getwallpapers.com/wallpaper/full/b/7/2/562844.jpg" alt="Card image cap" height="255" width="255">
    <div class="card-body">
      <h5 class="card-title">Profile</h5>
      <p class="card-text">In "Profile" you'll get all information of your user</p>
      <a href="Profile.jsp"> View profile </a>
    </div>
  </div>
</div>



</div>


<%@include file="Layout/Footer.jsp" %>