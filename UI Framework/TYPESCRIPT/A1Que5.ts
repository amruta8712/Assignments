let add=function(value=10){
    console.log(value);
}
add(20);

let userFriend=function(username: string, ...friends: string[]){
    console.log(username);

    
    console.log(friends);
    
}

userFriend("Amruta","A","B","C");

let printCapital=function(...names: string[]){
    for(let name of names){
        console.log(name.toUpperCase());
    }
}

const arr1=["amruta","amruta","amruta","amruta","amruta"];

printCapital(...arr1);