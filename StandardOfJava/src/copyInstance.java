class car {
    String color;   //색상
    String gearType;    //변속기 종류 = auto(자동), manual(수동)
    int door;   //문의 개수

    car() {
        this("red", "manual", 2);
    }
    car(car c) {    //인스턴스의 복사를 위한 생성자
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }
    car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class copyInstance {
    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car(c1);

        System.out.println("c1의 정보 : " + c1.color + ", " + c1.gearType + ", " + c1.door);
        System.out.println("c2의 정보 : " + c2.color + ", " + c2.gearType + ", " + c2.door);
    }
}
