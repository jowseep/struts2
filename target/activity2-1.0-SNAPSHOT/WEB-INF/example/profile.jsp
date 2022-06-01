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
        <div class="container">
            <div class="row">
                <!-- since the matching information is already stored in accountFound, we can then access its attributes -->
                <div class="col-md-4 mt-1">
                    <div class="card text-center sidebar">
                        <div class="card-body">
                            <img src="" alt="profile" class="rounded-circle" width="150">
                            <div class="mt-3"></div>
                            <h2>
                                <span><s:property value="accounts.username"/></span>
                            </h2>
                        </div>
                    </div>
                </div>
                <div class="col-md-8 mt-1">
                    <div class="card mb-3 content">
                        <h1 class="m-3pt-3">About</h1>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-md-3">
                                    <h5>Fullname: </h5>
                                </div>
                                <div class="col-md-9 text-secondary">
                                    <span><s:property value="nameInput"/></span>
                                    <span><s:property value="accounts.lastName"/></span>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-md-3">
                                    <h5>Birthdate:</h5>
                                </div>
                                <div class="col-md-9 text-secondary">
                                    <span><s:property value="accounts.birthDate"/></span>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-md-3">
                                    <h5>Email</h5>
                                </div>
                                <div class="col-md-9 text-secondary">
                                    <span><s:property value="accounts.email"/></span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="card mb-3 content">
                        <s:set var="typeAccount" value="accountFound.accountType"/>
                        <h1 class="m-3"><s:property value="#typeAccount"></s:property></h1>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-md-3">
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
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>