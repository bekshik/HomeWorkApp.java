package lesson6;

public class Main {
    public static void main(String[] args) {
       Dog dog = new Dog("Жучка", "собака", 400, 5);
       Cat cat = new Cat("Машка", "кошка", 100, 20);

        System.out.println(dog);
        dog.doAction();
        dog.run();
        dog.toSail();

        System.out.println(cat);
        cat.doAction();
        cat.run();
        cat.toSail();
     }
}
