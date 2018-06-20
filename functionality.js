window.onload = function() {
	var registration = document.getElementById("wrapper");
	var form = document.getElementById("reg");

	form.onclick = function() {
		registration.innerHTML = "<span> Name </span> <input id='firstname' type='text' >"
	}



};

function myFunction() {
	document.getElementById("myDropdown").classList.toggle("show");
}

window.onclick = function(e) {
	if (!e.target.matches('.dropbtn')) {
		var myDropdown = document.getElementById("myDropdown");
		if (myDropdown.classList.contains('show')) {
			myDropdown.classList.remove('show');
		}
	}
}