class Data {
    int x;
}
public class PrimitiveParam {
    public static void main (String args[]) {
        Data data = new Data();
        data.x = 10;
        System.out.println("X의 값은:" + data.x + "입니다.");

        change(data.x);

        System.out.println("X의 값은:" + data.x + "입니다.");
    }

    static void change(int x) {
        x = 1000;
        System.out.println("X의 값은:" + x + "입니다.");
    }
}