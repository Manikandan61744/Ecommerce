$(document).ready(function() {
	gobackBtnClick();
	populateOrders();
	mycartBtnClick();
	deleteBtnclick();
	
});

function populateOrders(){
		$.get("/order/allorders",
	function(data,status){
		$.each(data,function(key,value){
			console.log(key + " : " + value.name);
			$('#orders').append(getOrders(value.user.firstname,value.user.lastname,value.id,value.date,value.totalvalue));
		})
		}); 
}
function getOrders(firstname,lastname,date,totalvalue,id){
	var tableStr='<tr> \
									<td width="45%"> \
					 					<div class="display-flex align-center">  \
									 		<div class="name-user">'+ firstname +'_' + lastname +'</div> \
										</div> \
									</td> \
									<td width="15%" class="id">' + id +'</td> \
									<td width="15%" class="date">' + date +'</td> \
									<td width="15%" class="totalvalue">'+ totalvalue +'</td> \
									<td width="15%"><button class="round-black-btn small-btn" onClick="viewBtnClick('+ id +')" >View</button></td> \
									<td width="10%" class="text-center"><button onClick="deleteBtnclick('+ id +')" class="btn btn-sm btn-default">Delete</button></td> \
								</tr>';
								return tableStr;
}
function deleteBtnclick(id){
	$.get(
		'/order/delete',
		{
			id : id
		},
		function(data,status){
			if(status=="success"){
				alert("deleted successfully");
			}
			else{
				alert("failed to delete");
			}
		});
	alert("deleted the order");
}

function viewBtnClick(id){
	
	alert("view order details");
	window.location.href ="orderdetail.html";
}
function gobackBtnClick(){

	$("#goback").click(function(){
		alert("back to home screen");
		window.location.href ="homepg.html";
				
});
}
function mycartBtnClick(){
	$("#mycart").click(function(){
		alert("cart is added");
		window.location.href ="cart.html";
				
});
}
