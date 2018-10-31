<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mercado Gordo</title>
</head>
<body>
		BIENVENIDO A MERCADO GORDO, UN LUGAR DONDE COMPRAR Y SER GORDO A LA VEZ
		<br></br>
		
		Ver productos por categoria:
	<label for ="categorias">Categoria:</label>
	<select id = "categoria" onchange="changeCategory()">
	<option value = "0">Videocámaras y Cámaras Fotográficas</option>
	<option value = "1">Telefonía y Accesorios</option>
	<option value = "2">Televisores y Reproductores DVD</option>
	<option value = "3">Tablets, Libros Electrónicos y Accesorios</option>
	<option value = "4">Videojuegos, Consolas y Accesorios</option>
	<option value = "5">Drones</option>
	<option value = "6">Scooters Eléctricos</option>
	<option value = "7">Relojes y Smartwatch</option>
	<option value = "8">Audio y HI-FI</option>
	<option value = "9">Ordenadores y Periféricos</option>
	<option value = "10">Pilas, Cargadores y Adaptadores</option>
	<option value = "11">Accesorios de Electrónica </option>
	</select>
	<script type="text/javascript">
	function changeCategory (){
		var category = document.getElementById("categoria");
		window.location.href = "/GetAllItemsByCategoryServlet="+x;
	}
	<label for ="Carrito">Agregar a carrito:</label>
	<select id = "carrito" onchange= "agregarCarrito()">
	<option value = "0">Añadir al carrito</option>
	</script>
	<br></br>
	<form action="LogOutServlet" method = "post">
	<button type = "submit">Cerrar Sesion</button>
	</form>
</body>
</html>