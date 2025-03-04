/**
 * Makes Http call to backend and refreshes page when backend is done updating
 */
function refresh(){
    //Send HTTP request
    const Http = new XMLHttpRequest();
    const url = 'https://mighty-headland-04378.herokuapp.com/refresh';
    Http.open("GET", url);
    Http.send();

    //Wait for HTTP response
    Http.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
         location.reload();
        }
    };
}