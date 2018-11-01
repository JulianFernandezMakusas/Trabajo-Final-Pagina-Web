<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mercado Gordo</title>
</head>
<body>
	BIENVENIDO A MERCADO GORDO
	<br></br> Ver productos por categoria:
	<label for="categorias">Categoria:</label>
	<select id="categoria" onchange="changeCategory()">
		<option value="0">Seleccione categoria</option>
		<option value="1">Videocámaras y Cámaras Fotográficas</option>
		<option value="2">Telefonía y Accesorios</option>
		<option value="3">Televisores y Reproductores DVD</option>
		<option value="4">Tablets, Libros Electrónicos y Accesorios</option>
		<option value="5">Videojuegos, Consolas y Accesorios</option>
		<option value="6">Drones</option>
		<option value="7">Scooters Eléctricos</option>
		<option value="8">Relojes y Smartwatch</option>
		<option value="9">Audio y HI-FI</option>
		<option value="10">Ordenadores y Periféricos</option>
		<option value="11">Pilas, Cargadores y Adaptadores</option>
		<option value="12">Accesorios de Electrónica</option>
	</select>
	<script type="text/javascript">
		function changeCategory() {
			var category = document.getElementById("categoria");
			window.location.href = "/GetAllProductsServlet?=" + x;
		}
	</script>
	<br></br>
	<form action="LogOutServlet" method="post">
		<button type="submit">Cerrar Sesion</button>
	</form>
	<c:if test="${not empty listaItems }"></c:if>

	<c:set var="hayDatos"></c:set>

	<c:forEach var="ItemModelo" items="${listaItems}">

		<table>

			<tr>Producto: ${ItemModelo.name}</tr>

			<tr>Precio: ${ItemModelo.price}</tr>

			<tr>Descripcion: ${ItemModelo.description}</tr>

		</table>

	</c:forEach>

</body>
</html>