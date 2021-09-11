function isEven(num){
    return (num%2==0);
}

function find(arr,isEven){
    for(var i=0;i<arr.length;i++){
        if(isEven(arr[i])){
            return arr[i];
            break;
        }
    }
}

var arr1=[1,3,4,5,6];
 var r=find([1,3,2,4,5,6],isEven);
document.write(r);