class Data {
    int x;
}
public class ReferenceParam {
    public static void main (String args[]) {
        Data data = new Data();
        data.x = 10;
        System.out.println("X의 값은:" + data.x + "입니다.");

        change(data);

        System.out.println("X의 값은:" + data.x + "입니다.");
    }

    static void change(Data d) {
        d.x = 1000;
        System.out.println("X의 값은:" + d.x + "입니다.");
    }
}