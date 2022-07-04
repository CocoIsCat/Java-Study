class parent {
    int age;
}

class child extends parent {
    void cry() {
        System.out.println("응애");
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        parent p = new parent();
        child c = new child();
        p.age = 35;
        c.age = 1;

        System.out.printf("부모의 나이는 %d살 입니다.\n", p.age);   //부모의 나이는 35입니다.
        System.out.printf("자식의 나이는 %d살 입니다.\n",c.age);    //자식의 나이는 1입니다.

        c.cry();
    }
}
