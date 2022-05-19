<html>
<head>
</head>
<body>
    <div class="topnav">
        <s:url var="home" action="index"></s:url>
        <s:a href="%{home}">Home</s:a>
        <s:url var="blog" action="Blog"></s:url>
        <s:a href="%{blog}">Blog</s:a>
        <s:url var="contact" action="Contact"></s:url>
        <s:a href="%{contact}">Contact</s:a>
        <s:url var="about" action="About"></s:url>
        <s:a class="active" href="%{about}">About</s:a>
    </div>
</body>
</html>