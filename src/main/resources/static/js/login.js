/**
 * 
 */

 const registForm = document.querySelector("dialog");
 const openBtn = document.getElementById("open");
 const closeBtn = document.getElementById("close");
 
 const formFocus = document.getElementById("loginForm");
 const email = document.querySelector(".email");
 const password = document.querySelector(".password");
 
 openBtn.addEventListener("click", function(){
	registForm.showModal();
 }, false);
 
 closeBtn.addEventListener("click", function(){
	registForm.close();
 }, false);

 formFocus.addEventListener	("focus", function(event){
	switch(event.target.name){
		case "email":
			userName.classList.add("focus");
			event.target.classList.add("contained");
			break;
		case "pass":
			password.classList.add("focus");
			event.target.classList.add("contained");
			break;
	}
 }, true);

 formFocus.addEventListener("blur", function(event){
	if(event.target.value.length == 0){
		switch(event.target.name){
			case "email":
				userName.classList.remove("focus");
				event.target.classList.remove("contained");
				break;
			case "pass":
				password.classList.remove("focus");
				event.target.classList.remove("contained");
				break;
		}
	}
 }, true);

/**
$(document).ready(function(){
   $('.form').blur(function() {
        if($(this).val().length === 0){
          $('.formLabel').removeClass("focus");
        }
        else { return; }
      })
      .focus(function() {
        $('.formLabel').addClass("focus")
      });
});
 */