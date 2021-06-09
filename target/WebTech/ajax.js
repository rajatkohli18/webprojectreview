function savedata(){
 
    var dataFile = 'DisplayServlet';

    var httpRequest = new XMLHttpRequest();

    httpRequest.onreadystatechange = function() {
        if(httpRequest.readyState == 4)
        {
            if(httpRequest.status===200)
            {
                window.alert("VALID USER!")
                window.location = "http://localhost:8084/WebTech/index.jsp";
            }

            else if(httpRequest.status===401)
            window.alert("INVALID USER!!")
        }
    }
}