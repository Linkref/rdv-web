<%@ page import = "java.io.*,java.util.*" %>

<html>
   <head>
      <title>Cabinet M�dical</title>
   </head>
   
   <body>

      <%
         // New location to be redirected
         String site = new String("index");
         response.setStatus(response.SC_MOVED_TEMPORARILY);
         response.setHeader("Location", site); 
      %>
   </body>
</html>