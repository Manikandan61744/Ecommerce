 $(document).ready(function() {
	gobackBtnClick();
	populateOrderdetails();
	mycartBtnClick();
	
});

function populateOrderdetails(){
		$.get("/orderdetail/alldetails",
	function(data,status){
		$.each(data,function(key,value){
			console.log(key + " : " + value.itemname);
			$('#orderdetail').append(getOrderdetails(value.itemname,value.amount,value.quantity,value.id));
		})
		}); 
}
function getOrderdetails(itemname,amount,quantity,id){
	var tableStr='<tr> \
									<td width="30%"> \
					 					<div class="display-flex align-center">  \
											<div class="img-product"> \
												<img src="https://www.91-img.com/pictures/laptops/asus/asus-x552cl-sx019d-core-i3-3rd-gen-4-gb-500-gb-dos-1-gb-61721-large-1.jpg" \
													alt="" class="mCS_img_loaded"> \
											</div> \
											<div class="name-product">'+ itemname +'</div> \
										</div> \
									</td> \
									<td width="20%" class="price">INR ' + amount +'</td> \
									<td width="20%" class="quantity">' + quantity +'</td> \
									<td width="20%" class="text-center"><button onClick="deleteBtnclick('+ id +')" class="btn btn-sm btn-default">Delete</button></td>|<td width="20%" class="text-center"><button onClick="trackBtnclick()" class="btn btn-sm btn-default">Track my order</button></td> \
								</tr>';
								return tableStr;
}
function deleteBtnclick(id){
	$.get(
		'/orderdetail/deleteorderdetail',
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

function trackBtnclick(){
	
	alert("track the order");
	window.location.href ="ordertrackingdm.html";
	
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
