
function validate(){
    var companyName = document.getElementById("companyName").value;
    var password = document.getElementById("password").value;
    var location = document.getElementById("location").value;
    var description = document.getElementById("description").value;
    var contactInfo = document.getElementById("contactInfo").value;
    if(companyName === "" || password === "" || location === "" || description === "" || contactInfo === ""){
      alert("Please fill in all of the fields!");
    }
    else if(companyName != "" && password != "" && location != "" && description != "" && contactInfo != ""){
      document.getElementById("companyName").value = "";
      document.getElementById("password").value = "";
      document.getElementById("location").value = "";
      document.getElementById("description").value = "";
      document.getElementById("contactInfo").value = "";
      window.location.href = "Company-Thank-you.html";
    }
  }