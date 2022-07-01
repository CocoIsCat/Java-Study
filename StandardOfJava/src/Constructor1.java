class car {
    String color;   //색상
    String gearType;    //변속기 종류 = auto(자동), manual(수동)
    int door;   //문의 개수

    car(String c, String g, int d) {    //생성자
        color = c;
        gearType = g;
        door = d;
    }
}
public class Constructor1 {
    public static void main(String[] args) {
        car c = new car("white", "auto", 4);
    }

}