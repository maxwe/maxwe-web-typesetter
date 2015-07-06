<%--
  Created by IntelliJ IDEA.
  User: dingpengwei
  Date: 7/4/15
  Time: 13:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>typesetter</title>
  <link href="/img/book124.png" rel="shortcut icon">

  <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css">
  <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
  <script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
  <script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
  <style type="text/css">
    html {
      min-height: 100%;
      height:100%;
    }
    body {
      min-height: 100%;
      height:100%;
    }
    #container{
      height: 100%;
    }
  </style>
</head>
<body>
<div class="container" id="container">
  <iframe class="col-xs-6 col-sm-3 sidebar-offcanvas"  style="width: 20%; height: 100%;" scrolling="auto" src="/epub/init">

  </iframe>
  <iframe class="row row-offcanvas row-offcanvas-right" style="width: 80%; height: 100%;" scrolling="no" >

  </iframe>

</div>
</body>
</html>
