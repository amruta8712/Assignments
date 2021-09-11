var arr=[1,2,3,4,5];

function SumUsingFor(arr){
    var sum=0;
    for(var i=0;i<arr.length;i++){
        sum=sum+arr[i];
    }
    document.write("Sum using for loop is ",sum);
}

function SumUsingWhile(arr){
    var sum=0;
    var l=0
    while(l<arr.length){
        sum+=arr[l];
        l++;
    }
    document.write("Sum using while loop is ",sum);
}

function SunUsingDoWhile(arr){
    var sum=0;
    var l=0
    do{
        sum+=arr[l];
        l++;

    }while(l<arr.length);
    document.write("Sum using do while loop is ",sum);
}

SumUsingFor(arr);
SumUsingWhile(arr);
SunUsingDoWhile(arr);
