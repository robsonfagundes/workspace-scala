$(function(){

    $('#title').text('List Vip Persons:');

    //$.getJSON('/persons', function(data){
    //    if(data.errors != null){
    //        alert("There was an error! Wow What hell you doing REST");
    //    }else{
    //       //alert(Object.keys(data));
    //        $.each(data, function (key, val) {
    //            $('#li_persons').text(val.[0].name + ' REST');
    //        });
    //    }
    //}, 'json' )

    $.getJSON('/persons', function(data) {
        if(data.errors != null){
            alert("There was an error! Wow What hell you doing REST");
        }else{
            var list_vip = '<ul>';
            for (var i in data) {
               list_vip += '<li>' + data[i].name + '</li>';
            }
            list_vip += '</ul></br>';
            document.getElementById("list-persons").innerHTML = list_vip;
        }
    })


})