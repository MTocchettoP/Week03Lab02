<%-- 
    Document   : index
    Created on : Sep 26, 2017, 12:44:10 PM
    Author     : 733196
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h1>Simple JSP Calculator</h1>
        
        <form action="calculate" method="POST">
            First: <input type="text" name="first" value= ${firstValue}><br/>
            Second: <input type="text" name="second" value=${secondValue}><br/>
            <input type="submit" name="operation" value="+"> <input type="submit" name="operation" value="-"> 
            <input type="submit" name="operation" value="*"> <input type="submit" name="operation" value="%">
        </form>
        <br/>
        Result: ${result}

    </body>
</html>
