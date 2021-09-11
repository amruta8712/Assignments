var arr1=["Amruta","Patil"];
var arr2=[1,2,3,4,5];

function reverseArray(arr) {
    var newArray = [];
    for (var i = arr.length - 1; i >= 0; i--) {
      newArray.push(arr[i]);
    }
    return newArray;
  }

  document.write(reverseArray(arr1));
  document.write("\n");
  document.write(reverseArray(arr2));