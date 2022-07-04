class pointer {
    int x;
    int y;

    pointer() {
        this(0,0);
    }
    pointer(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class circle {
    pointer center;
    int radius;
    circle() {
        this(new pointer(0,0), 10);
    }
    circle(pointer p, int r) {
        this.center = p;
        this.radius = r;
    }
}
public class composite {
    public static void main(String args[]) {
        circle c1 = new circle();
        circle c2 = new circle(new pointer(1,2), 100);
        pointer p = new pointer(3,4);
        circle c3 = new circle(p,30);

        System.out.printf("c1의 원점 좌표는 (%d,%d)이고 반지름은 %d입니다.\n", c1.center.x, c1.center.y, c1.radius);
        System.out.printf("c2의 원점 좌표는 (%d,%d)이고 반지름은 %d입니다.\n", c2.center.x, c2.center.y, c2.radius);
        System.out.printf("c3의 원점 좌표는 (%d,%d)이고 반지름은 %d입니다.\n", c3.center.x, c3.center.y, c3.radius);
    }
}
