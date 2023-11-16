$(document).ready(function() {
	
	mycartBtnClick();
	populateMobileItems();
	wishlistBtnClick();
	//hoverhandle();
	onEvent();
	mouseEnter();
	mouseDown();
	//addTocart();
});


function populateMobileItems(){
	$.get("/allitem",
	function(data,status){
		$.each(data,function(key,value){
			console.log(key + " : " + value.name);
			$('#mobile').append(getMobileItemsAsCard(value.id,value.name,value.price));
		})
	});
	//$('#mobile').append(getMobileItemsAsCard());
}
function getMobileItemsAsCard(id,name,price){
	var divStr=' <div class="col-lg-3 col-sm-4 col-11 offset-sm-0 offset-1">\
            <div class="card">\
                <img class="card-img-top" src="https://m.media-amazon.com/images/I/41bUrjJLJyS._SL500_.jpg" alt="Card image cap">\
                <div class="card-body">\
                  <p class="card-text">'+name+'</p>\
                  <p>INR'+price+'</p>\
                  <button  onClick="addTocart(' + id +')" class="btn btn-default btn-sm">Add to Cart</button> <button onClick="addToWishlist('+ id +')" class="btn btn-light" ><i class="fa fa-heart"></i></button></div></div></div>'; 
        return divStr;
}

function mycartBtnClick(){
	$("#mycart").dblclick(function(){
		alert("cart is added");
		window.location.href ="cart.html";
				
});
}
function wishlistBtnClick(){
	$("#wishlist").click(function(){
		alert("product is added to wishlist");
		window.location.href ="wishlist.html";
				
});
}
function addTocart(id){
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
		alert("Added to cart: "+ id);
	
}
function addToWishlist(id){
		$.post(
		'/wishlist/save',
		{
			itemid : id,
			userid : 3
		},
		function(data,status){  
			if(status=="success"){
				alert("added to wishlist");
			}
			else{
				alert("failed to add")
			}
		});
		alert("Added to wishlist: "+ id);
}
/*function hoverhandle(){
		$("#mobile").hover(function(){
    alert("You want to go back to homescreen ?");
  },
  function(){
    alert("click the button!");
  });
}*/
function onEvent(){
	 $("#laptop").on({
    mouseenter: function(){
      $(this).css("background-color", "lightgray");
      //alert("you entered laptop")
    },  
    mouseleave: function(){
      $(this).css("background-color", "lightblue");
      //alert("you leaved laptop")
    }, 
    click: function(){
      window.location.href ="laptop.html";
    }  
  });
}
function mouseEnter(){
	$("#women").mouseenter(function(){
		alert("you entered women section")
	});
}
function mouseDown(){
	$("#men").mousedown(function(){
		alert("you entered men section")
	});
}
