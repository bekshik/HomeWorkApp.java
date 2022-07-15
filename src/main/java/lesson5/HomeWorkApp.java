package lesson5;


public class HomeWorkApp {


    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];

        employeeArray[0] = new Employee("Petrov A.A.", "manager", "Petr@mail.ru", 4603782, 15000, 37);
        employeeArray[1] = new Employee(" Pupkin A.A.", "cashier", "Pupok@mail.ru", 4603912, 11000, 27);
        employeeArray[2] = new Employee(" Sidorov A.A.", "loader", "Sid@mail.ru", 4604112, 8000, 41);
        employeeArray[3] = new Employee(" Voronina A.A.", "janitor", "Voron@mail.ru", 4604123, 9000, 52);
        employeeArray[4] = new Employee(" Dubov A.A.", "boogalter", "Dub@mail.ru", 4608563, 12000, 31);

        for (Employee employee : employeeArray)
            if (employee.getAge() >= 40)
                System.out.println(employee);

    }
}