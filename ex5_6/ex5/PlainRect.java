class PlainRect extends Rectangle{
    double x;
    double y;

    PlainRect(){
        this.x = 0;
        this.y = 0;
    }

    PlainRect(double x,double y, double length,double width){
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    public boolean isInside(double x,double y){
        if((x>this.x)&&(x<this.x+length)&&(y>this.y)&&(y<this.y+width)){
            return true;
        }
        else {
            return  false;
        }
    }

    public static void main(String args[]){
        PlainRect plainRect = new PlainRect(1,1,15,10);
        System.out.println("1.the area of the rectangle is "+plainRect.area());
        System.out.println("2.the perimeter of the rectangle is "+plainRect.perimeter());
        if(plainRect.isInside(15.5,12.2)){
            System.out.println("3.the point is inside the rectangle");
        }
        else{
            System.out.println("3.the point is not inside the rectangle");
        }
    }
}