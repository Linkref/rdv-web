<!DOCTYPE html>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="RdvServlet" method="post">

	<div>
		<span>Prise de rendez-vous</span>
	</div>
	<div>
		<span> 
			<% 
            String attribut = (String) request.getAttribute("test");
            out.println( attribut );
            %></span>
	</div>
	<div>
		<label>date (jj/mm/aaaa):</label>
		<input type="date" name="date">
	</div>
	<div>
		<label>heure:</label>
		<input  type="time" name="heure">
	</div>
	<div>
		<label>Client:</label>
		 <select name="patient">
		        <jsp:useBean id="patient"  scope="request" class="patient.ListePatient"/>
		 
 			<%		
 			   for(int i=0; i<patient.size();i++)
 			   {
 				   out.println("<option>"+patient.get(i).toString()+"</option>");
 			   }
 			%>
        </select>
	</div>
	<div>
		<label>Employe:</label>
		<input name="employe">
	</div>
	<div>
		
		<button  type="submit">Prendre rendez-vous</button>
	</div>	
				

</form>
</body>
</html>