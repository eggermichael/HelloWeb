<%-- 
    Document   : response
    Created on : 04-Nov-2017, 03:43:54
    Author     : Mike
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BMI Calculator v0.3</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="net.michaelegger.webapps.bmi_calculator.BMIHandler" />    
        <jsp:setProperty name="mybean" property="height" />
        <jsp:setProperty name="mybean" property="weight" />
        
        <H1>Result</H1>
        <p>Hello, your BMI is  <jsp:getProperty name="mybean" property="bmi"/></p>
    </body>
</html>
