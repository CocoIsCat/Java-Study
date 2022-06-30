public class Time {
    private int hour;
    private int minute;
    private float second;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public float getSecond() {
        return second;
    }

    public void setHour(int h) {
        if (h < 0 || h > 23)    //시의 범위는 0~23 사이가 아니면
            return; //입력값 무시
        hour = h;
    }

    public void setMinute(int m) {
        if (m < 0 || m > 59)    //분의 범위가 0~59 사이가 아니면
            return; //입력값 무시
        minute = m;
    }

    public void setSecond(float s) {
        if (s < 0.0f || s > 59.99f)
            return;
        second = s;
    }

    public static void main(String arg[]) {
        Time t1 = new Time();
        System.out.println(t1.getHour());   //0 출력
        System.out.println(t1.getMinute()); //0 출력
        System.out.println(t1.getSecond()); //0.0 출력

        t1.setHour(-1);
        System.out.println(t1.getHour());   //0 출력
        t1.setHour(13);
        System.out.println(t1.getHour());   //13 출력
    }
}
