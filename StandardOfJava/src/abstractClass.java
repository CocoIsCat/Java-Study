abstract class Player {
    boolean pause;
    int currentpos;

    Player() {
        pause = false;
        currentpos = 0;
    }

    abstract void play(int pos);    //지정된 위치(pos)에서 재생을 시작하는 기능이 수행되어야 한다.
    abstract void stop();   //재생을 즉시 멈추는 기능이 수행되어야 한다.

    void play() {
        play(currentpos);
    }

    void pause() {
        if(pause) {     //정지 상태면
            pause = false;
            play(currentpos);
        }
        else {      //재생 상태면
            pause = true;
            stop();
        }
    }
}

class CDPlayer extends Player {
    void play(int currentPos) {
        /*조상의 추상메서드를 구현했다고 침*/
    }
    void stop() {
        /*조상의 추상메서드를 구현했다고 침*/
    }
    int currentTrack;   //현재 재생중인 트랙

    void nextTrack() {
        currentTrack++;
        ...
    }
    void preTrack() {
        currentTrack--;
        ...
    }
}

public class abstractClass {
}
