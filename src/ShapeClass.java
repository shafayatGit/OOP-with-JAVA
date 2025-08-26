class Shape{
    int length,width,height;
    Shape(){
        this.width=5;
        this.height=10;
        this.length=0;
    }
    Shape(int width,int height){
        this.width=3;
        this.height=10;
        this.length=9;
    }
    Shape(int width,int height,int length){
        this.width=3;
        this.height=6;
        this.length=9;
    }
    Shape(Shape s){
        this(s.width,s.height,s.length);
    }
}
public class ShapeClass {
    public static void main(String[] args) {
        // set default value 10 to width, height and length
        Shape shape1 = new Shape();
//set width = 5, height = 10, length = 0
        Shape shape2 = new Shape(5, 10);
//set width = 3, height = 6, length = 9
        Shape shape3 = new Shape(3, 6, 9);
// set width, height and length to shape3’s width, height and length respectively.
        Shape shape4 = new Shape(shape3);

    }
}
