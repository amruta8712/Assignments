var array = ["Amruta", "Patil"];
var objarray = [];
var arrayToobject = function (arr) {
    for (var _i = 0, arr_1 = arr; _i < arr_1.length; _i++) {
        var i = arr_1[_i];
        var obj = { name: i, length: i.length };
        objarray.push(obj);
    }
    return objarray;
};
var result = arrayToobject(array);
console.log(result);
