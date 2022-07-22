package lesson6;

public abstract class Animal extends Object {
    private String nickname;
    private String typeofAnimal;
    private int runLength;
    private int swimLength;
    public Animal(String nickname, String typeofAnimal,int runLength, int swimLength) {
        this.nickname = nickname;
        this.typeofAnimal = typeofAnimal;
        this.runLength = runLength;
        this.swimLength = swimLength;
    }

    public int getSwimLength() {
        return swimLength;
    }

    public void setSwimLength(int swimLength) {
        this.swimLength = swimLength;
    }

    public int getRunLength() {
        return runLength;
    }

    public void setRunLength(int runLength) {
        this.runLength = runLength;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTypeofAnimal() {
        return typeofAnimal;
    }

    public void setTypeofAnimal(String typeofAnimal) {
        this.typeofAnimal = typeofAnimal;
    }

    @Override
    public String toString() {
        return String.format("%s %s",typeofAnimal, nickname);
    }

    public abstract void doAction();
}
