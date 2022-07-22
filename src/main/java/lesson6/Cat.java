package lesson6;

public class Cat extends Animal {


    public Cat(String nickname, String typeofAnimal,int runLength, int swimLength) {
        super(nickname, typeofAnimal, runLength, swimLength);
    }


    public void run() {
        if ((getRunLength() >= 0) && (getRunLength() <= 200)) System.out.println("Пробежала " + getRunLength() + " м");
        else System.out.println("Пробежала 200 м");
}

    public void toSail() {
        System.out.printf("%s кошки не плавают!%n%n", getNickname());
    }

    @Override
    public void doAction() {
        System.out.printf("%s %s  совершает действие%n",getTypeofAnimal(), getNickname());
    }
}
