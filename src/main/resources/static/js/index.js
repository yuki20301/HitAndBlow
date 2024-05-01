/**
 * 
 */

//alert("Hello World");

const howToPlay = document.querySelector("dialog");
const openBtn = document.getElementById("open");

openBtn.addEventListener("click", function() {
	howToPlay.showModal();
}, false);

howToPlay.addEventListener("click", function(event) {
	if(event.target.closest(".howto") === null){
		howToPlay.close();
	}
}, false);

