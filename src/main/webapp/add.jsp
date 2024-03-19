<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body bgcolor="red">
<%!
    int a=10;
%>
<%@ page import="java.util.*" %>
<%= "hello my name is bhanu prakash"%>
<%int i=Integer.parseInt(request.getParameter("num1"));
int j=Integer.parseInt(request.getParameter("num2"));
int k=i+j;out.println("Output  : "+k);
    %>
<%--now let us learn about jsp directives--%>

</body>
</html>