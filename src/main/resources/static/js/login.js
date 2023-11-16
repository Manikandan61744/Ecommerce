$(document).ready(function() {

	submitBtnClick();
	eventhandle();
});

function submitBtnClick(){
	$("#submit").click(function(event){
		event.preventDefault();

	$.post("/user/check",
		{
			emailid:$("#emailid").val(), 
			password: $("#password").val()
		},
		
		function(data,status) {
			if (data === true) {
				//alert(data,status);
				window.location.href ="homepg.html";
			}
			else {
				alert("invalid");
			}
		})
		});
}
function eventhandle(){
	$("#emailid").focus(function(){
		$(this).css("background-color", "AliceBlue");
	})
	$("#password").blur(function(){
		$(this).css("background-color", "FloralWhite");
	})
}

