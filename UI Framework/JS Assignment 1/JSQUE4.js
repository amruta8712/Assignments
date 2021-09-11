function headsratio(numberofflips){
    let headscounter=0;
    let tailscounter=0;
    for(let count=0;count<numberofflips;count++)
    {
        let flips=Math.floor(Math.random()*2);
        if(flips==0){
            headscounter+=1;
        }
        else{
            tailscounter+=1;
        }
    }
    document.write("<br>")
    document.write(`Heads: ${headscounter}`);
    document.write("<br>")
    document.write(`Tails: ${tailscounter}`);
    document.write("<br>")
    document.write(`result: ${headscounter/numberofflips}`);
    document.write("<br>")
}
headsratio(10);
headsratio(100);
headsratio(10000);
headsratio(10000000)