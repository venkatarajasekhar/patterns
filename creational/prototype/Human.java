package creational.prototype;

public class Human implements Copyable{

    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public Object copy() {
        return new Human(this.age, this.name);
    }
}
