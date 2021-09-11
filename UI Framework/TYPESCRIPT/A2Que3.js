"use strict";
var n = 100;
console.log("Armstrong Numbers:");
function armstong2() {
    for (var i = n; i > 0; i++) {
        var numberOfDigits = i.toString().length;
        var sum = 0;
        var temp = i.toString();
        for (var _i = 0, temp_1 = temp; _i < temp_1.length; _i++) {
            var char = temp_1[_i];
            sum += Math.pow(parseInt(char), numberOfDigits);
        }
        if (sum == i) {
            console.log(i);
            n = i;
            break;
        }
    }
}
function getNextArmstrong2() {
    n++;
    armstong2();
}
function reset() {
    n = 100;
}
armstong2();
getNextArmstrong2();
getNextArmstrong2();
getNextArmstrong2();
reset();
armstong2();
getNextArmstrong2();
getNextArmstrong2();
getNextArmstrong2();
