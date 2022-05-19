<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
    <link rel="stylesheet" href="style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Contact | Joseph</title>
</head>
<body>
      <header>
        <div class="topnav">
            <s:url var="home" action="index"></s:url>
            <s:a href="%{home}">Book</s:a>
            <s:url var="blog" action="Blog"></s:url>
            <s:a href="%{blog}">Explore</s:a>
            <s:url var="contact" action="Contact"></s:url>
            <s:a  class="active" href="%{contact}">Contact</s:a>
            <s:url var="about" action="About"></s:url>
            <s:a href="%{about}">About</s:a>
            <s:url var="oldLogin" action="oldLogin"></s:url>
            <s:a href="%{oldLogin}">Login</s:a>
        </div>
    </header>
      
    <main class="main">
      <div class="maintext">
        <h1 class="text1">This is my contact page.</h1>
        <p class="lead">Joseph can't come to the phone right now. Why? Because he is busy coding.</p>
        <p class="lead">
          <a href="#" class="btn btn-lg btn-secondary fw-bold border-white bg-white">Learn more</a>
        </p>
      </div>
    </main>
      
    <footer class="mainfooter">
      <a href="facebook.com/jowzeep" class="footer" >Facebook </a><span class="footer">|</span><span class="footer"> Instagram</span>
    </footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>