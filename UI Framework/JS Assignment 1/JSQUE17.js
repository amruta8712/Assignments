var arr=[1,2,3,4,5,6]

function rotateArray(lst, rotateBy) {
    const res = [];
    for (let i = rotateBy % lst.length, len = lst.length; res.length < len; i = ++i % len) {
      res.push(lst[i]);
    }
    return res;
  }


document.write(rotateArray(arr,2));