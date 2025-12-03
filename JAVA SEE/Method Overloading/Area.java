public class Area {
    // area of circle
    double findarea(double r){
        return 3.14 * r * r;
    }
    // area of rectangle
    int findarea(int l, int b){
        return l * b;
    }
    // area of square
    int findarea(int a){
        return a * a;
    }
    // area of triangle
    double findarea(double b, double h){
        return 0.5 * b * h;
    }

    public static void main(String[] args){
        Area area = new Area();
        System.out.println("Area of Circle: " + area.findarea(10.0));
        System.out.println("Area of rectangle: " + area.findarea(5, 10));
        System.out.println("Area of square: " + area.findarea(2));
        System.out.println("Area of triangle: " + area.findarea(5.0, 10.0));
    }
}
