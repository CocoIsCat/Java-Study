class TV {

    String color;  //색상
    boolean power;  //전원 상태
    int channel;  //채널
    int volume;  //음량

    void power() {  //전원을 켜고 끄는 메서드
        power = !power;
    }

    void channelUp() {  //채널 올리는 메서드
        channel++;
    }

    void channelDown() {  //채널 내리는 메서드
        channel--;
    }

    void volumeUp() {  //볼륨 올리는 메서드
        volume++;
    }

    void volumeDown() {  //볼륨 내리는 메서드
        volume--;
    }
}

public class TvTest2 {
    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new TV();

        tv1.channel = 7;    //tv1의 채널을 7로 변경
        tv2.channel = 7;
        System.out.println("tv1의 채널은 " + tv1.channel + " 번입니다.");    //tv1의 해널은 : 7 번입니다.
        System.out.println("tv2의 채널은 " + tv2.channel + " 번입니다.");    //tv2의 해널은 : 7 번입니다.

        tv1.channelDown();
        System.out.println("tv1의 채널은 " + tv1.channel + " 번입니다.");   //tv1의 해널은 : 6 번입니다.
        System.out.println("tv2의 채널은 " + tv2.channel + " 번입니다.");    //tv2의 해널은 : 7 번입니다.
    }
}
