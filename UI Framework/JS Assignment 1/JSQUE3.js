var num=prompt("Enter a number ");

function Parity(num){

    if(num%2==0){
        return "Even";
    }
    else{
        return "Odd";
    }
}

document.write(Parity(num));