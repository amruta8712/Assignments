class Rectangle{
    constructor(width,height){
        this.width=width;
        this.height=height;
    }
}
Rectangle.prototype.getArea=function(){
    return this.height*this.width;
}

const Rectangle1=new Rectangle(20,20);
area=Rectangle1.getArea();
document.write(area);