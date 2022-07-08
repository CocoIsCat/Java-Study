class User {
    public void methodU(Provider p) {
        p.methodP();
    }
}
class Provider {
    public void methodP() {
        System.out.println("Provider의 메서드");
    }
}

public class InterfaceTest {
    public static void main(String args[]) {
        User u = new User();
        u.methodU(new Provider());
    }
}
