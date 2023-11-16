$(document).ready(function() {
	submitBtnClick();
});
function submitBtnClick() {

$("#submit").click(function(){
	$.post("/user/save",
		{
			firstname:$('#firstname').val(),
			lastname:$('#lastname').val(),
			mobilenumber:$('#mobilenumber').val(),
			emailid:$("#emailid").val(),
			password: $('#password').val()
		},
		function(data, status) {
			//alert(data,status);
			window.location.href = "login.html";
		})
		});
}
