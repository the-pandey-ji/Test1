package inheritance;
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
