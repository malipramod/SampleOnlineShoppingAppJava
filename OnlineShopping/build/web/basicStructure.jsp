<html>
    <div style="visibility: hidden">
        <br />
        <a href="http://apycom.com/">Apycom jQuery Menus</a><br />
    </div>
    <head>
        <link rel="shortcut icon" href="images/headerlogo.jpg"/>
        <link rel="stylesheet" type="text/css" href="css/style.css" />

        <title></title>

        <link type="text/css" href="css/menu.css" rel="stylesheet" />
        <script type="text/javascript" src="js/script.js"></script>

        <script type="text/javascript" src="js/menu.js"></script>
        <title>Online Shopping Cart</title>
    </head>
    <body>
        <style type="text/css">
            * { margin:0;
                padding:0;
            }
            *{
                margin:0;
                padding:0;
            }

            #wrapper{
                width:960px;
                margin:0 auto;
                text-align:left;
            }
            body { background:#555 url(images/bg.jpg); }
            #menu { top:-22px; }

        </style>

        <div id="menu">
            <ul class="menu">
                <li><a href="home.jsp"><span>Home</span></a>

                <li><a href="Shop.jsp" class="parent"><span>Look For BOOKS</span></a>
                    <div class="columns two">
                        <ul class="one">
                            <li><a><span><b><h3>Books</h3></b></span></a></li>
                            <li><a href="Shop.jsp" id="Academic And Professional"><span>Academic & Professional</span></a></li>
                            <li><a href="Shop.jsp" id="Entrance Exam"><span>Entrance Exam</span></a></li>
                            <li><a href="Shop.jsp" id="Literature And Fiction"><span>Literature & Fiction</span></a></li>
                            <li><a href="Shop.jsp" id="Children"><span>Children</span></a></li>
                        </ul>                        
                    </div>
                </li>                                               
                &nbsp;
                &nbsp;
                <li class="last"><a href="viewCart.jsp"><span>View Cart</span></a></li>
                
                <li><a ><span></span></a></li>
                <li><a><span></span></a></li>
                <li><a href="LogIn.jsp"><span>LogOut</span></a></li>
            </ul>
        </div>
    </body>
</html>