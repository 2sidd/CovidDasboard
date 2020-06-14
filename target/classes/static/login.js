
function  login() {
    if($("#txtPassword").val()=="demo" && $("#txtUser").val()=="demo")
    {

        window.location.href="http://localhost:8080/dashboard";
    }
    else
    {
        alert("Please provide correct userId and Password");
    }
}