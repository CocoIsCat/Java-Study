class car {
    String color;   //색상
    String gearType;    //변속기 종류 = auto(자동), manual(수동)
    int door;   //문의 개수

    car() {     //생성자 1번
        this("white", "auto", 4);   //생성자 3번 호출
    }
    car(String color) { //생성자 2번
        this(color, "manual", 4); //생성자 3번 호출
    }
    car(String c, String g, int d) {    //생성자 3번
        color = c;
        gearType = g;
        door = d;
    }
}
public class Constructor2 {
    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car("blue");

        System.out.println("c1의 정보 :" + c1.color + ", " + c1.gearType + ", " + c1.door);
        System.out.println("c2의 정보 :" + c2.color + ", " + c2.gearType + ", " + c2.door);
    }
}