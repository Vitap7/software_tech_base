class Rectangle{
    double length;
    double width;

    Rectangle(){
        this.length = 10;
        this.width = 10;
    }

    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length * width;
    }

    public double perimeter(){
        return 2*(length+width);
    }
}