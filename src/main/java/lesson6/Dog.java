package lesson6;

public class Dog extends Animal {


    public Dog(String nickname, String typeofAnimal, int runLength, int swimLength) {
        super(nickname, typeofAnimal, runLength, swimLength);
    }



    public void run() {
        if ((getRunLength() >= 0) && (getRunLength() <= 500)) System.out.println("Пробежала " + getRunLength() + " м");
        else System.out.println("Пробежала 500 м");
    }

    public void toSail() {
        if ((getSwimLength() >= 0) && (getSwimLength() <= 10)) System.out.println("Проплыла " + getSwimLength() + "м");
        else System.out.printf("%s проплыла 10 м!%n%n", getNickname());
    }

    @Override
    public void doAction() {
        System.out.printf("%s %s  совершает действие%n",getTypeofAnimal(), getNickname());
    }

}
