if (true) {
    var tmp_1 = 123;
    console.log(tmp_1);
}
// console.log(tmp); this gives error beacuse of block scope
if (true) {
    var tmp = 123;
}
console.log(tmp);
