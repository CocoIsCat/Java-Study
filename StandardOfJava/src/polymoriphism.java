class Animal {
    String name;
    int age;

    Animal() {
        this("덕구", 1);
    }
    Animal(String n, int a) {
        this.name = n;
        this.age = a;
    }
}

class Tiger extends Animal {
    int rank;	//서열

    Tiger() {
        this(1);
    }
    Tiger(int r) {
        this.rank = r;
    }
    void roar() {
        System.out.println("어흥");
    }
}

class Lion extends Animal {
    int rank;

    Lion() {
        this(1);
    }
    Lion(int r) {
        this.rank = r;
    }
    void roar() {
        System.out.println("으르렁");
    }
}


public class polymoriphism {

    void casting(Animal ani) {
        if(ani instanceof Tiger) {
            Tiger ti = (Tiger)ani;
        }
        else if (ani instanceof Lion) {
            Lion li = (Lion)ani;
        }
    }

    public static void main(String args[]) {
        Animal ani;
    }
}
