var arr=[];

for(var i=0;i<20;i++){

    arr.push(Math.floor(Math.random() * 100) + 1);
}
console.log(arr);

function bubblrsort(arr){
    var temp;
    var l=arr.length;
    for(var i=0;i<l;i++){
        for(j=i+1;j<l;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    return arr;
}
document.write(bubblrsort(arr));