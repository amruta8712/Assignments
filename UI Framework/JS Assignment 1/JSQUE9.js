var arr1=["a","b","c"];
var arr2=[1,2,3];

var l=arr1.length + arr2.length;

function combine(arr1, arr2){

    var l=arr1.length + arr2.length;

    var result=[];
    var j=0,k=0;

    for(var i=0;i<l;i++){

        if(i%2==0){
            result[i]=arr1[j++];
        }
        else{
            result[i]=arr2[k++];
        }
    }

    return result;

}

document.write(combine(arr1, arr2));