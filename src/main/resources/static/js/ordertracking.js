$(document).ready(function() {
	
	populateOrdertracking();

	
});

function populateOrdertracking(){
		$.get("/allt",
	function(data,status){
		$.each(data,function(key,value){
			console.log(key + " : " + value.itemname);
			$('#ordertracking').append(getOrdertracking(value.shipmentdate,value.shipmentstatus,value.expecteddeliverydate,value.id));
		})
		}); 
}
function getOrdertracking(shipmentdate,shipmentstatus,expecteddeliverydate){
	var divStr='<div class="order-tracking completed"> \
									<span class="is-complete"></span> \
									<p>'+ shipmentstatus +'<br><span>'+ expecteddeliverydate +'</span></p> \
								</div>';
								return divStr;
}


