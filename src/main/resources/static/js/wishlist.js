$(document).ready(function() {
	gobackBtnClick();
	populateWishlistItems();
	mycartBtnClick();
	
	
});

function populateWishlistItems(){
		$.get("/wishlist/alllist",
	function(data,status){
		$.each(data,function(key,value){
			console.log(key + " : " + value.name);
			$('#wishlistitems').append(getWishlistItems(value.itemname,value.itemprice,value.id));
		})
		}); 
		 
}
function getWishlistItems(itemname,itemprice,id){
	var tableStr='<tr> \
									<td width="45%"> \
					 					<div class="display-flex align-center"> \
											<div class="img-product"> \
												<img src="https://www.91-img.com/pictures/laptops/asus/asus-x552cl-sx019d-core-i3-3rd-gen-4-gb-500-gb-dos-1-gb-61721-large-1.jpg" \
													alt="" class="mCS_img_loaded"> \
											</div> \
											<div class="name-product">'+ itemname +'</div> \
										</div> \
									</td> \
									<td width="15%" class="price">INR ' + itemprice +'</td> \
									<td width="15%"><span class="in-stock-box">In Stock</span></td> \
									<td width="15%"><button class="round-black-btn small-btn" onClick="cartBtnClick('+ id +')" >Add to Cart</button></td> \
									<td width="10%" class="text-center"><button onClick="deleteBtnclick('+ id +')" class="btn btn-sm btn-default">Delete</button></td> \
								</tr>';
								return tableStr;
}
function deleteBtnclick(id){
	$.get(
		'/wishlist/delete',
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
	alert("deleted the items: "+id );
}
function cartBtnClick(id){
	$.post(
		'/cart/save',
		{
			itemid : id,
			userid : 3
		},
		function(data,status){
			if(status=="success"){
				alert("added to cart");
			}
			else{
				alert("failed to add")
			}
		});
	alert("added the item :" +id);
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
