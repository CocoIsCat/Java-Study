interface I {
    public abstract void methodP();
}

class User {
    public void methodU(I i) {
        i.methodP();
    }
}
class Provider implements I{
    public void methodP() {
        System.out.println("Provider 클래스의 메서드");
    }
}

public class InterfaceTest {
    public static void main(String args[]) {
        User u = new User();
        u.methodU(new Provider());
    }
}
