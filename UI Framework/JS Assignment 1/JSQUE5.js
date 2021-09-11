var Year=prompt("Enter a current Year ");
var count=1;
while (count <= 20) {

    if ((Year % 4 == 0) && (Year % 100 != 0)||(Year % 400 == 0)) {
        
        document.write(Year);
        document.write("\n");
        Year++;
        count++;
    } 
    else {
    Year++;
    }    
}