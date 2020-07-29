package inheritance;
//The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in
// the Java interface, not method body.
// It is used to achieve abstraction and multiple inheritance in Java.

interface Drawable{
    void draw();
    default void msg(){System.out.println("default method");} // we can use method body in interface by default method
    static int cube(int x){return x*x*x;}   //static method
}

class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}
class TestInterfaceDefault{
    public static void main(String args[]){
        Drawable d=new Rectangle();
        d.draw();
        d.msg();
        System.out.println(Drawable.cube(3));   //all tatic method
    }}
