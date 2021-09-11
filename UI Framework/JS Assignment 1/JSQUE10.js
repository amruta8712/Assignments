var n=100;
var n1=1,n2=1;
var temp=n1+n2;

console.log("Fiboncci Series is ");
console.log(n1);
console.log(n2);

for (var i = 1; i <= n; i++) {
    console.log(temp);
    temp = n1 + n2;
    n1 = n2;
    n2 = temp;
}