class Animal {
    String name;
    int age;
}
public class VariableAndMethod {

    public static void main(String[] args) {
        Animal cat = new Animal();
        Animal dog = new Animal();

        cat.name = "코코";
        cat.age = 2;
        dog.name = "덕구";
        dog.age = 7;

        System.out.println(cat.name);   //코코 출력
        System.out.println(dog.name);	//덕구 출력
        System.out.println(cat.age);	//2 출력
        System.out.println(dog.age);	//7 출력

    }
}
