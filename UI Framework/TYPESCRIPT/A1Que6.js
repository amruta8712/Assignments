"use strict";
var laptop = {
    model: 2021,
    desk_no: 1,
    name: "amruta"
};
function getTicket() {
    console.log("Miss " + laptop.name + ", Your laptop model: " + laptop.model + " is assigned to desk no " + laptop.desk_no + ". Description : Screen is Broken.");
}
getTicket();
