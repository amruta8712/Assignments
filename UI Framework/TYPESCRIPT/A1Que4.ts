var array=["Amruta","Patil"];

var objarray=[];

const arrayToobject= (arr) => {
    for(let i of arr){
        let obj={name: i, length:i.length};
        objarray.push(obj);
    }
    return  objarray;
}

const result=arrayToobject(array);
console.log(result);