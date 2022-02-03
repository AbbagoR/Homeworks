/**
 * Java 1. Homework 5
 * 
 * @author Mikhail Dementev
 * @version 30.01.2022 - 31.01.2022
 */

public class HW5 {
    public static void main(String[] args) {
        Comrade[]comrades = {
                new Comrade("Ivan", "engineer", "Ivan@mail.ru", "phone", 25000, 25),
                new Comrade("Carl", "operator", "Carl@mail.ru", "phone", 25000, 44),
                new Comrade("Inokentiy", "boxer", "Inokentiy@mail.ru", "phone", 25000, 40),
                new Comrade("Alexey", "manager", "Alexey@mail.ru", "phone", 25000, 45),
                new Comrade("Alexandr", "operator", "Alexandr@mail.ru", "phone", 25000, 50)
        };
        for (Comrade comrade : comrades) {
            if (comrade.getAge() > 40) {
                System.out.println(comrade);
            }
        }
    }
}

class Comrade {
    private String name;
    private String job;
    private String email;
    private String phone;
    private int money;
    private int age;

    public Comrade(String name, String job, String email, String phone, int money, int age) {
        this.name = name;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.money = money;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (name +
                "\n- job: " +job +
                "\n- email: " +email +
                "\n- phone: " +phone +
                "\n- money: " +money +
                "\n- age: " +age);
    }
}