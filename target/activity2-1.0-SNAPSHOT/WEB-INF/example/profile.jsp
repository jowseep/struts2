<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
    <link rel="stylesheet" href="style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>About | Joseph</title>
</head>
    <body>
        <header>
            <div class="topnav">
                <s:url var="home" action="index"></s:url>
                <s:a href="%{home}">Home</s:a>
                <s:url var="blog" action="Blog"></s:url>
                <s:a href="%{blog}">Blog</s:a>
                <s:url var="contact" action="Contact"></s:url>
                <s:a href="%{contact}">Contact</s:a>
                <s:url var="about" action="About"></s:url>
                <s:a href="%{about}">About</s:a>
                <s:url var="oldLogin" action="oldLogin"></s:url>
                <s:a href="%{oldLogin}">Logout</s:a>
            </div>
        </header>
        <main>
            <h1>Firstname:</h1>
            <span><s:property value="accountFound.firstName"/></span>
            <h1>Lastname:</h1>
            <span><s:property value="accountFound.lastName"/></span>
            <h1>Birthdate:</h1>
            <span><s:property value="accountFound.birthDate"/></span>
            <h1>Bio:</h1>
            <span><s:property value="accountFound.bio"/></span>
        </main>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>