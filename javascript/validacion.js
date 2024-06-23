
function enableBtn(){
    email=document.getElementById("email").value
    pass=document.getElementById("pass").value

   if(email.length > 0 && pass.length > 0){
     document.getElementById("btnSubmit").className="btn btn-primary"
   }else{
     document.getElementById("btnSubmit").className="btn btn-primary disabled"
   }
  
}

