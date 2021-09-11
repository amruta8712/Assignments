var array=["Amruta","Patil","Engineer","ETC"];

var [ firstname, lastname, degree, dept]=array;

console.log(degree);

const organization = {
    name: 'Amruta',
    address: {
        houseNo: 2,
        street: 'Malvadi',
        pincode: 416112
    }
};

function fetchpin({address:{pincode:pin}})
{
    return `${pin}`;
}

console.log(fetchpin(organization));