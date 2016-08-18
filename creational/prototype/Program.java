package creational.prototype;

public class Program {

    public static void main(String[] args) {

        HumanFactory factory = new HumanFactory(new Human(23, "Roman"));

        Human human = factory.makeCopy();

        factory.setPrototype(new Human(23, "Olha"));

        human = factory.makeCopy();
    }

}
