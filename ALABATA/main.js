function dongho(){
    var today = new Date();
    var gio = today.getHours();
    var phut = today.getMinutes();
    var giay = today.getSeconds();
    if(gio<10){
        gio = "0" + gio;
    }
    if(phut<10){
        phut = "0" + phut;
    }
    if(giay<10){
        giay = "0" + giay;
    }
    document.getElementById("time").innerHTML = gio + ":" + phut + ":" + giay;
    setTimeout("dongho()",1000);
}
dongho();