<%--
  Created by IntelliJ IDEA.
  User: koppa
  Date: 19-03-2024
  Time: 08:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int num1=Integer.parseInt(request.getParameter("num1"));
    int num2=Integer.parseInt(request.getParameter("num2"));
    String op=request.getParameter("operation");
    try
    {
        switch (op)
        {
            case "+":
                out.println("Addition of two numbers is "+ num1+num2);
                break;
            case "-":
                out.println("Subtraction of two numbers is "+ (num1-num2));
                break;
            case "*":
                if(num2==0)out.println("You can;t divide a number by 0");
                else out.println("Multiplication of two numbers is "+num1/num2);
                break;
            case "%":
                out.println("Modulo of two numbers is "+num1%num2);
                break;
            default:
                out.println("Please Enter the right operator");
                break;
        }
    }
    catch (Exception e)
    {
        out.println(e.getStackTrace());
    }
%>
</body>
</html>
