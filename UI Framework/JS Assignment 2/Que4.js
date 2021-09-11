function square(x){
    return x*x;
}
function map(arr, square ){
    var newArray=[];

    for(var i=0;i<arr.length;i++){
        newArray.push(square(arr[i]));
    }
    return newArray;
}




document.write(map([1,2,3],square));