<%-- 
    Document   : Index

    Created on : 16-Oct-2018, 12:38:37
    Author     : dmt1
--%>

<%@include file="Layout/Header.jsp" %>
<link rel="stylesheet" type="text/css" href="CSS/index.css">


<section class="login-block">
    <div class="container">
        <div class="row">
            <div class="col-md-4 login-sec">
                <h2 class="text-center">Login Now</h2>
                <form class="login-form" action="FrontController" method="POST">
                    <input type="hidden" name="command" value="login">
                    <div class="form-group">

                        <input type="text" class="form-control" name="email" placeholder="Email">

                    </div>
                    <div class="form-group">

                        <input type="password" class="form-control" name="password" placeholder="Password">
                    </div>


                    <div class="form-check">

                        <input type="submit" class="btn btn-login float-right" value="Login">
                    </div>

                </form>
                <br>
                <br>
                <div class="form-check">


                    <button type="button" class="btn btn-login float-right" data-toggle="modal" data-target="#exampleModal">Sign up </button>
                </div>
            </div>

            <div class="col-md-8 banner-sec">
                <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner" role="listbox">
                        <div class="carousel-item active">
                            <img class="d-block img-fluid" src="http://getwallpapers.com/wallpaper/full/3/8/c/188392.jpg"  alt="First slide">
                            <div class="carousel-caption d-none d-md-block">

                            </div>
                        </div>
                        <div class="carousel-item">
                            <img class="d-block img-fluid" src="https://images.pexels.com/photos/7097/people-coffee-tea-meeting.jpg" alt="First slide">
                            <div class="carousel-caption d-none d-md-block">

                            </div>
                        </div>
                        <div class="carousel-item">
                            <img class="d-block img-fluid" src="https://images.pexels.com/photos/872957/pexels-photo-872957.jpeg" alt="First slide">
                            <div class="carousel-caption d-none d-md-block">

                            </div>
                        </div>
                    </div>	   

                </div>
            </div>
        </div>
</section>




<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Sign up</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form name="register" action="FrontController" method="POST">  
                <div class="modal-body">

                    <input type="hidden" name="command" value="register">
                    <br>
                    <input type="text" name="email" placeholder="Email">
                    <br>
                    <br>
                    <input type="password" name="password1" placeholder="Password">
                    <br>
                    <br>
                    <input type="password" name="password2" placeholder="Retype password">


                </div>
                <div class="modal-footer">
                    <input type="submit" class="btn btn-login float-right" value="Sign up">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>

                </div>
            </form>      
        </div>
    </div>
</div>

<% String error = (String) request.getAttribute("error");
    if (error != null) {
        out.println("<H2>Error!!</h2>");
        out.println(error);
    }
%>












<%@include file="Layout/Footer.jsp" %>
