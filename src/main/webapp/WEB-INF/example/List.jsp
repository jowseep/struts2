<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
    <link rel="stylesheet" href="style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>List | Joseph</title>
</head>
    <s:include value="/Nav.jsp"></s:include>
<body> 
    <h3>All User Records:</h3>  
    <s:iterator value="account">  
    <fieldset>  
    <s:property value="firstName"/><br/> 
    <s:property value="lastName"/><br/>
    <s:property value="username"/><br/>
    <s:property value="birthDate"/><br/>
    <s:property value="email"/><br/><hr>
    </fieldset>  
    </s:iterator>
</body>
</html>