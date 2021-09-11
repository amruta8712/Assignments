const order={
    id:10,
    title:"Pizza",
    price:200,
    printOrder(){
        console.log(this.title);
    },
    getPrice(){
        console.log(this.price);
    }

};

const NewOrder=Object.assign(order);

console.log(order);
console.log(NewOrder);
NewOrder.getPrice();
NewOrder.printOrder();