<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");

String id = request.getParameter("id");
if(id.equals("admin")) {
    session.setAttribute("id",id);
    response.sendRedirect("loginok.jsp");
    }else{
        response.sendRedirect("loginfail.jsp");
    }
%>

<script>
alert("로그인 실패");
location.href="loginfail.jsp";
</script>
</body>
</html>