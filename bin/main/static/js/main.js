/**
 * 
 */
//alert("Hello World");

var selectDigit;

function DropDown(event){
	const dropdown = event.target.closest(".dropdown");
	const rect = event.target.getBoundingClientRect();
	
	selectDigit = event.target.closest(".ans");
	
	const layer = dropdown.querySelector(".numLayer");
	const menu = dropdown.querySelector(".menu");
	
	menu.style.top = `${rect.top + rect.height - 1}px`;
    menu.style.left = `${rect.left}px`;
    menu.style.minWidth = `${rect.width}px`;

    layer.classList.add("numLayer--show");
}

function DropDownOutside(event) {
    event.target.classList.remove("numLayer--show");
}

function DropDownMenu(event){
	var digit = "digit";
	const value = event.currentTarget.dataset.value;
    const label = event.currentTarget.innerText;
    
    const layer = event.target.closest(".numLayer");
    const dropdown = event.target.closest(".dropdown");
       
    for(let i = 1; i <= 4; i++){
		var digit = "digit" + i;
		console.log(selectDigit);
		console.log(digit);
		if(selectDigit.classList.contains(digit)){
			selectDigit.value = value;
		}
	}
 
    const items = dropdown.getElementsByClassName("numbers");
	const digits = dropdown.getElementsByClassName("ans");
	for (let i = 0; i < items.length; i++) {
		const item = items[i];
		if (digits[0].value == items[i].innerText){
			event.currentTarget.classList.add("numbers--active");
	    }else if (digits[1].value == items[i].innerText) {
	    	event.currentTarget.classList.add("numbers--active");
	    }else if (digits[2].value == items[i].innerText){
			event.currentTarget.classList.add("numbers--active");
		}else if (digits[3].value == items[i].innerText){
			event.currentTarget.classList.add("numbers--active");
		}else{
			item.classList.remove("numbers--active");
		}
	}
	    
    layer.classList.remove("numLayer--show");
}

var target = document.getElementById("scroll");
target.scrollIntoView(false);