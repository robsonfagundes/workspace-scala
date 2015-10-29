$(function(){
    $('#title').text('List Vip Persons:');
    $.getJSON('/persons', function(data) {
        if(data.errors != null){
            alert("There was an error!");
        }else{
            var list_vip = '<ul>';
            for (var i in data) {
               list_vip += '<li><strong>' + data[i].name + '</strong></li>';
               list_vip += 'Street 89, Downtown Cascacity </br>';
               list_vip += '<a href="">Edit</a>' + ' - ';
               list_vip += '<a href="">Remove</a>';
            }
            list_vip += '</ul></br>';
            $("#list-persons").html(list_vip);
        }
    })
})