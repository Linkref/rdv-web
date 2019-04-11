<%@ page contentType="text/xml" %>
<horaires>
<%@ page import="java.util.ArrayList" %>
<%	

		ArrayList<String> horaires = (ArrayList<String>) request.getAttribute("horaires");

		for(String h : horaires)
			out.println("<heure>"+h+"</heure>");

   %>
</horaires>
