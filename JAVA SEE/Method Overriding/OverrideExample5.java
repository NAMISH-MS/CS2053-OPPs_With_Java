// Q5. Create a Shape class and override draw() in Circle, Square & Triangle

class Shape{
    void draw(){
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a square");
    }
}

class Triangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a triangle");
    }
}

public class OverrideExample5 {
    public static void main(String[] args){
        Shape s;
        
        s = new Shape();
        s.draw();

        s = new Circle();
        s. draw();

        s =  new Square();
        s.draw();

        s =  new Triangle();
        s.draw();
    }    
}
