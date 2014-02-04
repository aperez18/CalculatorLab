<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Results</title>
    </head>
    <body>
        <p>
            <% 
                if(request.getAttribute("answer") != null){
                    double answer = (Double)request.getAttribute("answer");
                    out.println(answer);
                }else{
                    %>
            <p>Something went wrong.</p>
            <a href="index.html">Click here to try again.</a>
            <%
                }
            %>
        </p>
    </body>
</html>
