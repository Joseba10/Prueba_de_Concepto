<html>
<body>
	<h2>Hello World!</h2>
	<form action="perfil" method="post">
	
		<label  for="nombre">Nombre</label>
		<input type="text" name="nombre" id="nombre">
		
		<label for="apellidos">Apellidos</label>
		<input type="text" name="apellidos" id="apellidos">
		
		<label for="direccion">Direccion</label>
		<input type="text" name="direccion">
		
		<label for="pais" >Pais</label>
		<select name="pais" id="pais">
		
			<option value="Mexico">Mexico</option>
			<option value="Argentina">Argentina</option>
			<option value="Brazil">Brazil</option>
			<option value="Peru">Peru</option>
	
		</select>
		
		<input type="submit" value="enviar">
	
	</form>
</body>
</html>
