<%@ page import="Feiz.po.User" %>
<%@ page import="java.util.List" %>
<%@ page import="Feiz.dao.UserDao" %>
<%@ page import="Feiz.dao.impl.UserDaoImpl" %>
<%--
  Created by IntelliJ IDEA.
  User: zl
  Date: 1/23/2015
  Time: 9:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Hello</title>
</head>
<body>
<h2>Welcome</h2>

<s:if test="#session.userList!=null">
  <%
    List<User> list =(List<User>)session.getAttribute("userList");
    for(int i = 0; i < list.size(); i++) {
      out.println(list.get(i).getName()+"\n");
    }
    out.println("1111");
  %>
  <h2>Hello <s:property value="#session.userService.listAll().get(1).name"/></h2>
</s:if>

</body>
</html>