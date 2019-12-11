<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
${jajoPower}
<h1>JESTEM JSP</h1>
km ${param.km} to
${param.km*0.62}

mil

<c:out value="<b> bold text </b>" escapeXml="true"/>

</body>
</html>
