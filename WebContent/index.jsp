<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">

	<div>
		<span>Prise de rendez-vous</span>
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
		<label>Lieu:</label>
        <select name="lieu">
            <option>Room A</option>
            <option>Room B</option>
            <option>Room C</option>
        </select>
	</div>
	<div>
		<label>Client:</label>
		<input name="client">
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