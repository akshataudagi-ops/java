import java.util.*;
class Box { 
    int length, breadth; 
 
    Box() { 
        length = breadth = 0; 
    } 
 
    Box(int side) { 
        length = breadth = side; 
    } 
 
    Box(int length, int breadth) { 
        this.length = length; 
        this.breadth = breadth; 
    } 
 
    void area() { 
        System.out.println("Area = " + length * breadth); 
    } 
}
public class constructorOverload {
    public static void main(String args[]) {
        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(10,2);
        b1.area();
        b2.area();
        b3.area();


    }
}