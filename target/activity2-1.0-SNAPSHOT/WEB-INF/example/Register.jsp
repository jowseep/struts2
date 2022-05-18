<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
    <link rel="stylesheet" href="style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Register | Joseph</title>
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
            <s:a class="active" href="%{newLogin}">Register</s:a>
        </div>
    </header>

    <main class="newloginbody">
        <s:form action="Register" class="signin" theme="css_xhtml">
            <s:textfield key="account.firstName" class="firstName" placeholder="Username"/>
            <s:textfield key="account.lastName" class="lastName" placeholder="Lastname"/>
            <s:textfield key="account.username" class="username" placeholder="Username"/>
            <s:password key="account.password" placeholder="password"/>
            <s:textfield key="account.birthDate" class="birthDate" placeholder="Birthdate"/>
            <s:textfield key="account.email" class="email" placeholder="Email"/>
            <s:submit class="submitBtn"/>
        </s:form>
    </main>
      
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>