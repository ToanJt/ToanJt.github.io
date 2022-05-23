var index=1;
changeImage = function() {
    var imgs=["/image/banner1.jpeg","/image/banner2.jpeg","/image/banner3.jpg"];
    document.getElementById('img').scr = imgs[index];
    index++;
}
setInterval(changeImage, 3000);