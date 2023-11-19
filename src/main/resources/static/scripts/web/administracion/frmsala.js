$(document).on("click", "#btnnuevo", function(){
    //alert("Hola estoy con JQUERY");
    $("#txtdescripcion").val("");
    $("#txtasientos").val("");
    $("#cboestado").empty();
    $("#hddidsala").val("0");
    $.ajax({
            type: "GET",
            url: "/administracion/estado/listar",
            dataType: "json",
            success: function(resultado){
                $.each(resultado, function(index, value){
                    $("#cboestado").append(
                    `<option value="${value.idestado}">${value.descestado}</option>`)
                });
            }
        });
    $("#modalsala").modal("show");
});

$(document).on("click", ".btnactualizar", function(){
    $("#modalestado").modal("show");
    $("#txtdescripcion").val($(this).attr("data-descsala"));
    $("#txtasientos").val($(this).attr("data-asientos"));
    $("#hddidsala").val($(this).attr("data-idsala"));
    $("#cboestado").empty();
    $.ajax({
                type: "GET",
                url: "/administracion/estado/listar",
                dataType: "json",
                success: function(resultado){
                    $.each(resultado, function(index, value){
                        $("#cboestado").append(
                        `<option value="${value.idestado}">${value.descestado}</option>`)
                    });
                }
            });
    $("#modalsala").modal("show");
});

$(document).on("click", "#btnguardar", function(){
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/administracion/sala/registrar",
        data: JSON.stringify({
            idsala: $("#hddidsala").val(),
            descsala: $("#txtdescripcion").val(),
            asientos: $("#txtasientos").val(),
            idestado: $("#cboestado").val()
        }),
        success: function(resultado){
            if(resultado.respuesta){
                //listarEstados();
            }
            alert(resultado.mensaje);
            $("#modalsala").modal("hide")
        }

    })
});