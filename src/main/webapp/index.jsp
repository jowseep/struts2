<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
    <link rel="stylesheet" href="style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Home | Joseph</title>
</head>

<body>
        <header>
            <div class="topnav">
                <s:url var="home" action="index"></s:url>
                <s:a class="active" href="%{home}">Book</s:a>
                <s:url var="blog" action="Blog"></s:url>
                <s:a href="%{blog}">Explore</s:a>
                <s:url var="contact" action="Contact"></s:url>
                <s:a href="%{contact}">Contact</s:a>
                <s:url var="about" action="About"></s:url>
                <s:a href="%{about}">About</s:a>
                <s:url var="oldLogin" action="oldLogin"></s:url>
                <s:a href="%{oldLogin}">Login</s:a>
                <s:url var="RegisterPage" action="RegisterPage"></s:url>
                <s:a href="%{RegisterPage}">Register</s:a>
                <s:url var="List" action="List"></s:url>
                <s:a href="%{List}">List</s:a>
            </div>
        </header>      
      
        <main>
          <div class="inner-layer">
            <div class="container">
              <div class="row no-margin">
                <div class="col-sm-7">
                  <h1>Where do you wanna go</h1>
                </div>
                <div class="col-sm-5">
                  <div class="form-data">
                    <div class="form-head">
                      <h1>Book Now</h1>
                    </div>
                    <div class="form-body">
                      <div class="row form-row">
                        <input type="text" class="form-control" placeholder="Departure City">
                      </div>
                      <div class="row form-row">
                        <input type="text" class="form-control" placeholder="Destination City">
                        </div>
                      </div>
                      <div class="row form-row">
                        <input type="text" class="form-control" placeholder="Date and Time">
                      </div>
                      <div class="row form-row">
                        <button class="btn btn-success btn-appointment">
                          Book now
                        </button>
                      </div>
                    </div>
                  </div>

                </div>
              </div>
            </div>
          </div>
        </main>
      
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>