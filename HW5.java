/**
 * Java 1. Homework 5
 * 
 * @author Mikhail Dementev
 * @version 30.01.2022 - 31.01.2022
 */
 
class HW5 {
    public static void main (String[] args) {
        Comrade comrade = new Comrade();
        if (comrade.age > 40){
            System.out.println(comrade);
        }
    }
 }
 
class Comrade {
    private String name;
    private String profession;
    private String email;
    private String phone;
    private int money;
    private int age;
    public int getAge() {
            return age;
    }
    Comrade (String name, String profession, String emai, String phone, int money, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
        this.money = money;
        this.age = age;
    }

    Comrade[] cArray = new Comrade[5];
            cArray[0] = new Comrade("Ivan", "Job", "email", "phone", "25000", "25");
            cArray[1] = new Comrade("Carl", "Job", "email", "phone", "25000", "30");
            cArray[2] = new Comrade("Inokentiy", "Job", "email", "phone", "25000", "40");
            cArray[3] = new Comrade("Alexey", "Job", "email", "phone", "25000", "45");
            cArray[4] = new Comrade("Alexandr", "Job", "email", "phone", "25000", "50");

     @Override
     public String toString() {
         return "Comrade:" + name + ", " + profession + ", " + emai + ", " + phone + ", " + money + ", " + age;
     }
 }