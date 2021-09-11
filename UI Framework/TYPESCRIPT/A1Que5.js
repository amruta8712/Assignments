var add = function (value) {
    if (value === void 0) { value = 10; }
    console.log(value);
};
add(20);
var userFriend = function (username) {
    var friends = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        friends[_i - 1] = arguments[_i];
    }
    console.log(username);
    console.log(friends);
};
userFriend("Amruta", "A", "B", "C");
var printCapital = function () {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    for (var _a = 0, names_1 = names; _a < names_1.length; _a++) {
        var name_1 = names_1[_a];
        console.log(name_1.toUpperCase());
    }
};
var arr1 = ["amruta", "amruta", "amruta", "amruta", "amruta"];
printCapital.apply(void 0, arr1);
