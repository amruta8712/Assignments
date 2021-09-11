var order = {
    id: 10,
    title: "Pizza",
    price: 200,
    printOrder: function () {
        console.log(this.title);
    },
    getPrice: function () {
        console.log(this.price);
    }
};
var NewOrder = Object.assign(order);
console.log(order);
console.log(NewOrder);
NewOrder.getPrice();
NewOrder.printOrder();
