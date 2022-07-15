package lesson5;

public class Employee {
    private String name;
    private String post;
    private String email;
    private int telephone;
    private int salary;
    private int age;

    Employee(String name, String post, String email, int telephone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    void printInfo(){
        System.out.println(String.format("%nСотрудник %s,  должнасть %s, emeil  %s,%n тел.  %d, зарплата %d, возраст %d. %n", name, post, email, telephone, salary, age));

    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return(name+ ", " +post+ ", " +email+ "\n" +telephone+ ", " +salary+ ", " +age + "\n");
    }
}
