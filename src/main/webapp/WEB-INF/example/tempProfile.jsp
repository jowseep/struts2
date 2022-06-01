<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
    <link rel="stylesheet" href="style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>About | Joseph</title>
</head>
    <body>
        <p>Firstname: <s:property value="accountFound.firstName" /></p>
        <p>Lastname: <s:property value="accountFound.lastName" /></p>
        <p>Username: <s:property value="accountFound.username" /></p>
        <p>Birthdate: <s:property value="accountFound.birthDate" /></p>
        <p>Email: <s:property value="accountFound.email" /></p>
    </body>
</html>