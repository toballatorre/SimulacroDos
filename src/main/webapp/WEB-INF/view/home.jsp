<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">

</head>
<body>
	
	<main class="container">
		<section class="row">
			<h1 class="col-12 text-center h1">Búsqueda de facturas</h1>
			
			<form class="col-4 m-auto" action="./" method="get">
				<div class="form-group">
					<label id="id">Numero de Factura: </label>
					<input class="form-control" type="number" name="id" required="required">
				</div>
				<div class="form-group">
					<input class="btn btn-primary w-100" type="submit" value="Buscar">
				</div>
			</form>
			
		</section>
		<section class="row">
			<c:if test="${factura != null }">
				<div class="col-8 m-auto">
					<p><strong>Cliente: </strong><c:out value="${factura.getCliente()}"/></p>
					<p><strong>Fecha: </strong><c:out value="${factura.getFecha()}"/></p>
				</div>
				<div class="table-responsive col-8 m-auto">
					<table class="table table-striped table-hover">
						<thead class="thead-light">
							<tr>
								<th scope="col">Producto</th>
								<th scope="col">Precio</th>
								<th scope="col">Cantidad</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${factura.getListaDetalleFactura()}" var="detalle">
								<tr>
									<td><c:out value="${detalle.getProducto().getNombre()}"></c:out> </td>
									<td><c:out value="${detalle.getProducto().getValor()}"></c:out> </td>
									<td><c:out value="${detalle.getCantidad()}"></c:out> </td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="col-8 m-auto">
					<p><strong>Subtotal: </strong><c:out value="${factura.subtotal()}"/></p>
					<p><strong>Impuesto: </strong><c:out value="${factura.impuesto()}"/></p>
					<p><strong>Total: </strong><c:out value="${factura.total()}"/></p>
				</div>
			</c:if>
		</section>
	</main>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
		integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
		crossorigin="anonymous"></script>
	<script defer="defer" type="text/javascript" src="<c:url value="/resources/js/jquery-3.5.1.js"></c:url>"></script>
	
	<script type="text/javascript">
		$(function(){
			$.getJSON("http://localhost:8085/simulacrouno/listaBenef",
					function(data){
				console.log(data);
				$(data).each(function(i, benef){
					console.log(benef.id + " " + benef.nombre);
					$('#opBenef').append(new Option(benef.nombre, benef.id));
				});
			});
		});
	</script>
</body>
</html>