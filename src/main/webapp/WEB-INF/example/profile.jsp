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
                <s:a class="active" href="%{home}">Profile</s:a>
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
        <main class="mainProfile">
            <!-- since the matching information is already stored in accountFound, we can then access its attributes -->
            <p>Firstname:</p>
            <span><s:property value="accountFound.firstName"/></span>
            <p>Lastname:</p>
            <span><s:property value="accountFound.lastName"/></span>
            <p>Birthdate:</p>
            <span><s:property value="accountFound.birthDate"/></span>
            <p>Bio:</p>
            <span><s:property value="accountFound.bio"/></span>
        </main>

        <div class="mainProfile">
            <s:set var="typeAccount" value="accountFound.accountType"/>
            <h1><s:property value="#typeAccount"></s:property></h1>
            <!-- ang accountFound.accountType is stored na siya sa typeAccount so no need to reiterate when accessing-->
            <s:if test='%{#typeAccount == "admin"}'>
                <p>Admin information</p>
                <p>Number of booked seats: 754</p>
                <p>Revenue over the last 2 months: P866,491.43</p>
                <p>Growth for the last month: 101%</p>
            </s:if>
            <s:else>
                <p>Refer a friend now!</p>
            </s:else>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>