function validationDate(date) {
    var reGoodDate = /(^(((0[1-9]|1[0-9]|2[0-8])[-](0[1-9]|1[012]))|((29|30|31)[-](0[13578]|1[02]))|((29|30)[-](0[4,6,9]|11)))[-](19|[2-9][0-9])\d\d$)|(^29[-]02[-](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)/;
    return reGoodDate.test(date);
}

function afficherBadges(horaires) {
	for (var i = 9; i <= 19; i++) {
		if (horaires.indexOf(i+"h") == -1)
			$('#heure').html($('#heure').html()+"<option> "+i+"h</option> ");
		else
			$('#heure').html($('#heure').html()+"<option disabled>"+i+"h (Chréno déjà réservé)</option> ");
	}
}

function afficherHoraires() {
	$('#heure').html(" ")
	
	if(validationDate($( "#date" ).val())) {

		var horraires = [];
		
		$.ajax({
	        type: "get",
	        url: "/RDV/horaires?med="+$('#selectMed').val().replace(' ', '_')+"&date="+$('#date').val(),
	        dataType: "xml",
	        success: function(data) {
	        	var tab = data.getElementsByTagName("heure");
	        	
	        	for ( var i = 0; i< tab.length; i++) {
	        		horraires.push(tab[i].childNodes[0].nodeValue);
	        	}

	        	console.log(horraires);
	        	afficherBadges(horraires);

	        },
	        error: function(xhr, status) {
	        	alert('Impossible de récupérer les horraires');
	        }
	    });
			
		$('#horaires').show();		
	} else
		$('#horaires').hide();
}

$( "#formRdv" ).submit(function( event ) {
	if(!validationDate($( "#date" ).val())) {
		alert('Date Invalide');
		event.preventDefault();
	}	
});


$('#date').change(function(e){
		afficherHoraires();
});

$('#selectMed').change(function(e){
		afficherHoraires();
});


