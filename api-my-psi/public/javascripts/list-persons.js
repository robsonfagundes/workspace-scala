$(function(){
    $('#title').text('List Vip Persons:');
    $.getJSON('/persons', function(data) {
        if(data.errors != null){
            alert("There was an error!");
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