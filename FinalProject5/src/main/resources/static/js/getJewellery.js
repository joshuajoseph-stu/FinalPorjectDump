const url = "http://localhost:8181/api/jewelleryall";

	async function callApi() {
		let response = await
		fetch(url);
		let jsonStr = await
		response.text();
		const jsonObj = JSON.parse(jsonStr);
		const data = jsonObj;
		const tableBody = document.getElementById("table_body");	
		console.log(data);
		for ( let x in data) {
			let obj = data[x];

			const row = document.createElement("tr");

			const cell1 = document.createElement("td");
			cell1.innerHTML = obj.jId;
			const cell2 = document.createElement("td");
			cell2.innerHTML = obj.jName;
			const cell3 = document.createElement("td");
			cell3.innerHTML = obj.jPrice;
			

			const cell6 = document.createElement("td");
			const btnBook = document.createElement("button");
			btnBook.classList.add("btn", "btn-primary");
			btnBook.innerHTML = "Book";

			cell6.appendChild(btnBook);

			row.appendChild(cell1);
			row.appendChild(cell2);
			row.appendChild(cell3);
			row.appendChild(cell6);

			tableBody.appendChild(row);
		}
	}
	callApi();