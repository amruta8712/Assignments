const compose = (f1, f2) => (value) => f1(f2(value));

const square = (x) => x * x;
const double = (x) => x * 2;

var f1 = compose(square, double);
document.write(f1(5));
document.write("<br>");
document.write(f1(10));
document.write("<br>");
var f2 = compose(double, square);
document.write(f2(5));
document.write("<br>");
document.write(f2(10));