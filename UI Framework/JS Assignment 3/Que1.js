class Rectangle{
    constructor(width,height){
        this.width=width;
        this.height=height;
    }
}

const Rectangle1=new Rectangle(20,20);
Rectangle1.width=40;
document.write(Rectangle1.width);
document.write("<br>");
document.write(Rectangle1.height);