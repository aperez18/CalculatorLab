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
                double answer = (Double)request.getAttribute("answer"); //Check this for null first!
                out.println(answer);
            %>
        </p>
    </body>
</html>
