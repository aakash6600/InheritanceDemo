package p1;

public class Main {

    public static void main(String[] args) {
	    Cat cat1 = new Cat();
        cat1.name = "missy";
        cat1.breed = "short hair";
        cat1.weight = 6;
        cat1.age = 1;

        Bird bird1 = new Bird();
        bird1.name = "Tweety";
        bird1.breed = "Conure";
        bird1.weight = 1;
        bird1.age = 2;

        System.out.println(cat1 + "\n\n" + bird1);
    }
}

abstract class Pet {
    String name;
    String breed;
    double weight;
    int age;

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}

class Bird extends Pet {
    String vocalize = "Tweet";
    int legs = 2;
    boolean canFly = false;
    boolean CanTalk = false;

    @Override
    public String toString() {
        String s2 = "Bird{" +
                "vocalize='" + vocalize + '\'' +
                ", legs=" + legs +
                ", canFly=" + canFly +
                ", CanTalk=" + CanTalk +
                '}';
        String s1 = super.toString();
        return s1 + "\n" + s2;
    }
}

class Cat extends Pet {
    String vocalization = "Meow";
    int legs = 4;
    boolean isNeutered = false;
    boolean isHouseBroken = false;

    @Override
    public String toString() {
        String s1 = super.toString();
        String s2 = "Cat{" +
                "vocalization='" + vocalization + '\'' +
                ", legs=" + legs +
                ", isNeutered=" + isNeutered +
                ", isHouseBroken=" + isHouseBroken +
                '}';
        return s1 + "\n" + s2;
    }
}