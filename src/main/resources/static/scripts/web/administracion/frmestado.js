$(document).on("click", "#btnnuevo", function(){
    //alert("Hola estoy con JQUERY");
    $("#txtdescripcion").val("");
    $("#hddidestado").val("0")
    $("#modalestado").modal("show");
});

$(document).on("click", ".btnactualizar", function(){
    $("#modalestado").modal("show");
    $("#txtdescripcion").val($(this).attr("data-descestado"));
    $("#hddidestado").val($(this).attr("data-idestado"));
});

$(document).on("click", ".btneliminar", function(){
    //alert("Hola estoy con JQUERY");
    $("#modalestado").modal("show");
});
