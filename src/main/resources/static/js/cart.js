$(document).ready(function() {
	populateCartItems();
	gobackBtnClick();
	//deleteBtnclick();
	checkoutBtnClick();
});
function populateCartItems(){
	$.get("/cart/listall",
	function(data,status){
		$.each(data,function(key,value){
			console.log(key + " : " + value.name);
			$('#cart').append(getCartItems(value.itemname,value.itemprice,value.id));
		})
		});
}
function getCartItems(itemname,itemprice,id){
	var divStr=' <div class="d-flex flex-row justify-content-between align-items-center pt-lg-4 pt-2 pb-3 border-bottom mobile"> \
                <div class="d-flex flex-row align-items-center"> \
                    <div><img src="https://m.media-amazon.com/images/I/41bUrjJLJyS._SL500_.jpg" width="150" height="150" alt="" id="image"></div> \
                    <div class="d-flex flex-column pl-md-3 pl-1"> \
                        <div><h6>'+ itemname +'</h6></div> \
                       </div></div> \
                <div class="pl-md-0 pl-1"><b>INR '+ itemprice +'</b></div> \
                <div class="pl-md-0 pl-3"> \
                    <input class="form-control-sm" type="text" value="1" /> \
                </div> \
                <div class="pl-md-0 pl-1"><b>$19.98</b></div> \
                <button onClick="deleteBtnclick('+ id +')" class="btn btn-sm btn-default">Delete</button> \
            </div>';
            return divStr;
}
function gobackBtnClick(){
	$("#goback").click(function(){
		alert("back to home screen");
		window.location.href ="homepg.html";
				
});
}
function deleteBtnclick(id){
	$.get(
		'/cart/delete',
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
	alert("delete item");
	
}
function checkoutBtnClick(){
	$("#checkout").click(function(){
		$.post("/order/placeorder", 
		function(data,status){
		alert("order is placed");
		window.location.href ="order.html";	
		});
		
	});
}