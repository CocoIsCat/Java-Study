import java.util.*;

class Animal implements Comparable<Animal>{
    String name;    //이름
    String species; //종
    int date;   //등록일자

    Animal(String n, String s, int d) {
        this.name = n;
        this.species = s;
        this.date = d;
    }

    public int compareTo(Animal a) {
        if(this.date > a.date) {
            return 1;
        }
        else if(this.date < a.date) {
            return -1;
        }
        else {
            return 0;
        }
    }
}

class sort {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("coco", "cat", 20200314));
        animals.add(new Animal("momo", "dog", 20180617));
        animals.add(new Animal("bori", "dog", 20220228));
        animals.add(new Animal("tori", "cat", 20151030));
        animals.add(new Animal("hodu", "dog", 20170621));

        System.out.println("정렬 전");
        for(Animal A : animals) {
            System.out.println("이름:" + A.name + " 종:" + A.species + " 등록일자:"  + A.date);
        }
        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                if(o1.species.equals(o2.species)) {
                    return o1.date - o2.date;
                }
                else {
                    return o1.species.compareTo(o2.species);
                }
            }
        });
        System.out.println("\n\n정렬 후");
        for(Animal A : animals) {
            System.out.println("이름:" + A.name + " 종:" + A.species + " 등록일자:"  + A.date);
        }
    }
}
