function mostraralumnos(){
	$("#contenedor").show();
	$.ajax({
		type : "post",
	   // headers: {"X-CSRF-TOKEN": token}, //send CSRF token in header
		url : "/paginaprofesor/list",
		success : function(res) {
			$('#alumnostable').bootstrapTable('load', res);
			$('#alumnostable tbody').on('click', 'tr', function () {
				$("#nombrealumno").val($(this).find("td:eq(0)").text());
				$("#alumnapellidopat").val($(this).find("td:eq(1)").text());
				$("#alumnapellidomat").val($(this).find("td:eq(2)").text());
			});
			$("#boton").hide();
		}
	});
}
function mostrar(){
	$.ajax({
		type:"post",
		url:"/paginaprofesor/listacurso",
		data : "rutprofesor="+$("#rutprofesor").val(),
		success:function(res){
			$.each(res);
			$('#tabla').append("<option value=" +res.rutprofesor+">"+res.curnivel+" "+res.curletra+"</option>");
			},
			error:function(){
				alert("error");
			}
		
	});
}
