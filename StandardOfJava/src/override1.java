class parent {
    int x = 10;
    void parentMethod() {
        System.out.println("parent");
    }
}

class child extends parent {
    void print() {
        int x = 20;
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
public class override1 {
    public static void main(String args[]) {
        child c = new child();
        c.print();
    }
}
