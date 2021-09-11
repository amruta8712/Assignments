var array = ["Amruta", "Patil", "Engineer", "ETC"];
var firstname = array[0], lastname = array[1], degree = array[2], dept = array[3];
console.log(degree);
var organization = {
    name: 'Amruta',
    address: {
        houseNo: 2,
        street: 'Malvadi',
        pincode: 416112
    }
};
function fetchpin(_a) {
    var pin = _a.address.pincode;
    return "" + pin;
}
console.log(fetchpin(organization));
