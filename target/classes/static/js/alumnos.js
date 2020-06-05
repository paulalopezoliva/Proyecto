function AlumnosController(option){
	$("#msg").hide();
	$("#msg").removeClass("alert-success").addClass("alert-danger");
	var token = $("meta[name='_csrf']").attr("content");
	
	switch(option){
	case "list":
		$.ajax({
			type : "post",
		    headers: {"X-CSRF-TOKEN": token}, //send CSRF token in header
			url : "/alumnos/list",
			success : function(res) {
				$('#alumnostable').bootstrapTable('load', res);
				$('#alumnostable tbody').on('click', 'tr', function () {
					$("#rutalumno").val($(this).find("td:eq(0)").text());
					$("#rutdigitoalumno").val($(this).find("td:eq(1)").text());
					$("#nombrealumno").val($(this).find("td:eq(2)").text());
					$("#alumnapellidopat").val($(this).find("td:eq(3)").text());
					$("#alumnapellidomat").val($(this).find("td:eq(4)").text());
					$("#alumnfechanacim").val($(this).find("td:eq(5)").text());
					$("#alumndireccion").val($(this).find("td:eq(6)").text());
					$("#alumntelefono").val($(this).find("td:eq(7)").text());
					$("#id_curso").val($(this).find("td:eq(8)").text());
					$("#mymodal .close").click();
				});
				$("#mymodal").modal({show:true});
			},
			error : function() {
				$("#msg").show();
				$("#msg").html("Error en busqueda de alumnos.")
			}
		});       			
		break;
	case "get":
		$.ajax({
			type : "post",
		    headers: {"X-CSRF-TOKEN": token}, //send CSRF token in header
			url : "/alumnos/get",
			data : "rutalumno="+$("#rutalumno").val(),
			success : function(res) {
				if (res == null || res == "") {
					$("#msg").show();
					$("#msg").html("No se encontraron registros.");
				} else {	
					$("#rutalumno").val(res.rutalumno);
					$("#rutdigitoalumno").val(res.rutdigitoalumno);
					$("#nombrealumno").val(res.nombrealumno);
					$("#alumnapellidopat").val(res.alumnapellidopat);
					$("#alumnapellidomat").val(res.alumnapellidomat);
					$("#alumnfechanacim").val(res.alumnfechanacim);
					$("#alumndireccion").val(res.alumndireccion);
					$("#alumntelefono").val(res.alumntelefono);
					$("#id_curso").val(res.id_curso);
				}
			},
			error : function() {
				$("#msg").show();
				$("#msg").html("Error en busqueda.");
			}
		});       			
		break;
	case "insert":
		$("#rutalumno").val(0),
		$("#rutdigitoalumno").val(""),
		$("#nombrealumno").val(""),
		$("#alumnapellidopat").val(""),
		$("#alumnapellidomat").val(""),
		$("#alumnfechanacim").val(new Date()),
		$("#alumndireccion").val(""),
		$("#alumntelefono").val(0),
		$("#id_curso").val(0)	
	    break;
	case "update":
		var json = 
			{
				'rutalumno': $("#rutalumno").val(),
				'rutdigitoalumno': $("#rutdigitoalumno").val(),
				'nombrealumno': $("#nombrealumno").val(),
				'alumnapellidopat': $("#alumnapellidopat").val(),
				'alumnapellidomat': $("#alumnapellidomat").val(),
				'alumnfechanacim': $("#alumnfechanacim").val(),
				'alumndireccion': $("#alumndireccion").val(),
				'alumntelefono':  $("#alumntelefono").val(),
				'id_curso':  $("#id_curso").val()
			};

		var postData = JSON.stringify(json);

		$.ajax({
			type : "post",
		    headers: {"X-CSRF-TOKEN": token}, //send CSRF token in header
			url : "/alumnos/update",
			data : postData,
			contentType : "application/json; charset=utf-8",
			dataType : "json",
			success : function(res) {
				if (res == 1) {
					$("#msg").removeClass("alert-danger").addClass("alert-success");
					$("#msg").show();
					$("#msg").html("Registro modificado correctamente.");
				} else {
					$("#msg").show();
					$("#msg").html("No se pudo modificar el registro.");
				}
			},
			error : function() {
				$("#msg").show();
				$("#msg").html("No se pudo modificar el registro.");
			}
		});       	
    break;
	case "delete":
		$.ajax({
			type : "post",
		    headers: {"X-CSRF-TOKEN": token}, //send CSRF token in header
			url : "/alumnos/delete",
			data : "rutalumno="+$("#rutalumno").val(),
			success : function(res) {
				if (res == 1) {
					$("#msg").removeClass("alert-danger").addClass("alert-success");
					$("#msg").show();
					$("#msg").html("Registro eliminado correctamente.");
				} else {
					$("#msg").show();
					$("#msg").html("No se pudo eliminar el registro.");
				}
			},
			error : function() {
				$("#msg").show();
				$("#msg").html("No se pudo eliminar el registro.");
			}
		});
		break;
	default:
		$("#msg").show();
		$("#msg").html("Opción incorrecta.");
	}
}
