<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'manageone.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>
    <frameset rows="88,*" cols="*" frameborder="no" border="0"framespacing="0">
      <frame src="jsp/manage/managetop.jsp" name="topFrame" scrolling="No" noresize="noresize" id="topFrame" title="topFrame" />
    
	    <frameset cols="187,*" frameborder="no" border="0" framespacing="0">
		    <frame src="jsp/manage/manageleft.jsp" name="leftFrame" scrolling="No" noresize="noresize" id="leftFrame" title="leftFrame" />
		     <frame src="jsp/manage/manageright.jsp" name="rightFrame" id="rightFrame" title="rightFrame" />
	     </frameset>
     </frameset>
<noframes><body>
</body></noframes>
</html>