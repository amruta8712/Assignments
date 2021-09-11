if (true) {
    let tmp = 123;
    console.log(tmp);
}
// console.log(tmp); this gives error beacuse of block scope

if (true) {
    var tmp = 123;
}
console.log(tmp);