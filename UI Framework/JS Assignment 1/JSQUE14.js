var arr=[];
var even=0,odd=0,sum=0,avg=0;
for(var i=0;i<100;i++){

    arr.push(Math.floor(Math.random() * 100) + 1);
}
console.log(arr);

//document.write(arr);
document.write(Math.max.apply(null, arr));
document.write("\n");
document.write(Math.min.apply(null, arr));

for(var i=0;i<100;i++){
    if(arr[i]%2==0){
        even++;
    }
    else{
        odd++;
    }
    sum=sum+arr[i];
}
avg=sum/100;
document.write("\n");
document.write("Sum is ",sum);
document.write("\n");
document.write("Average is ",avg);
document.write("\n");
if(even>odd){
    document.write("even count",even);
}
else{
    document.write("odd count",odd);
}