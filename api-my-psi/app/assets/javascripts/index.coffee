$ ->
 $.get "/persons", (persons) ->
  $.each persons, (index, person) ->
   $("#ul_persons").append $("<li>").text person.name