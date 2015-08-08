var downloadButton = document.getElementById("download");
var counter = 10;
var newElement = document.createElement("p");
newElement.innerHTML = "Your download will commence 10 seconds.";
var id;
downloadButton.parentNode.replaceChild(newElement, downloadButton);
id = setInterval(function() {
counter--;
  if(counter < 0) {
     newElement.parentNode.replaceChild(downloadButton, newElement);
     clearInterval(id);
    } else {
      newElement.innerHTML = "Your download will commence " + counter.toString() + " seconds.";
      }
  }, 1000);
