class Rectangle{
    constructor(width,height){
        this.width=width;
        this.height=height;
    }
}
Rectangle.prototype.getArea=function(){
    return this.height*this.width;
}

var  r=new Rectangle(4,5);
r.height=50;
document.write(r.getArea());