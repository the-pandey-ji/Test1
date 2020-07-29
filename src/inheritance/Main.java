package inheritance;

public class Main extends Xyz implements abc{

    public static void main(String[] args) {
        Main m=new Main();
        System.out.println("main class");
        btech();
        System.out.println("abstract class done");
        m.print();
    }

    @Override
    public void print() {
        System.out.println("interface method");
    }
}
