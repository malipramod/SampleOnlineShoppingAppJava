<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>     
        <script type="text/javascript" src="js/modernizr-1.5.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <script type="text/javascript" src="js/modernizr-1.5.min.js"></script>
        <title>Online shopping</title>
    </head>
    <body>        
        <%@include file="basicStructure.jsp" %>        
        <h2><center><h2>One Shop Stop for Books!!</h2></center></h2> <br><br/>      
        <div id="site_content">
            <div id="sidebar_container">
                <div class="sidebar">
                    <h1>Latest Books</h1>
                    <h2>New Releases</h2>
                    <p>We've redesigned our own website. Take a look around and let us know what you think.</p>
                </div>

                <div class="sidebar">
                    <h1>Contact Us</h1>
                    <p>We'd love to hear from you. Complete our <a href="Contact.jsp">contact form</a>.</p>
                </div>
            </div>
            <div id="content">
                <ul class="slideshow">
                    <li class="show"><img width="706" height="316" src="images/1.jpg" alt="image one" /></li>
                    <li><img width="706" height="316" src="images/2.jpg" alt="image two" /></li>
                    <li><img width="706" height="316" src="images/3.jpg" alt="image three" /></li>
                    <li><img width="706" height="316" src="images/4.jpg" alt="image four" /></li>
                    <li><img width="706" height="316" src="images/5.jpg" alt="image five" /></li>
                </ul>
                <div id="content_item">

                </div>
            </div>
        </div>
        <footer>
            <p><a href="home.jsp">Home</a> |   <a href="contact.jsp  ">Contact Us</a></p>

        </footer>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
    </div>

    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/jquery.easing-sooper.js"></script>
    <script type="text/javascript" src="js/jquery.sooperfish.js"></script>
    <script type="text/javascript" src="js/image_fade.js"></script>
    <script type="text/javascript">
        $(document).ready(function() {
            $('ul.sf-menu').sooperfish();
        });
    </script>

        
    </body>
</html>
