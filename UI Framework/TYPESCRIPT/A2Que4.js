"use strict";
var User = /** @class */ (function () {
    function User(name, message) {
        this.name = name;
        this.message = message;
    }
    return User;
}());
var msgUser1 = new Map();
msgUser1.set("message1", "This is the message 1");
msgUser1.set("message2", "This is the message 2");
var user1 = new User("Amruta", msgUser1);
var msgUser2 = new Map();
msgUser2.set("message1", "This is the message 1");
msgUser2.set("message2", "This is the message 2");
var user2 = new User("Amruta", msgUser2);
var msgUser3 = new Map();
msgUser3.set("message1", "This is the message 1");
msgUser3.set("message2", "This is the message 2");
var user3 = new User("Amruta", msgUser3);
var msgUser4 = new Map();
msgUser4.set("message1", "This is the message 1");
msgUser4.set("message2", "This is the message 2");
var user4 = new User("Amruta", msgUser4);
var msgUser5 = new Map();
msgUser5.set("message1", "This is the message 1");
msgUser5.set("message2", "This is the message 2");
var user5 = new User("Amruta", msgUser5);
var msgUser6 = new Map();
msgUser6.set("message1", "This is the message 1");
msgUser6.set("message2", "This is the message 2");
var user6 = new User("Amruta", msgUser6);
var usersSet = new Set();
var usersSet2 = new Set();
usersSet.add(user1);
usersSet.add(user2);
usersSet.add(user3);
function addUserRoom2(user) {
    if (!usersSet.has(user) && usersSet2.size < 3) {
        usersSet2.add(user);
    }
}
addUserRoom2(user4);
addUserRoom2(user5);
addUserRoom2(user6);
var chatroom = new Map();
chatroom.set("chatroom1", usersSet);
chatroom.set("chatroom2", usersSet2);
console.log(chatroom);
