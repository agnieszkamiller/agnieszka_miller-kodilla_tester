package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void personalDetails() {
        String informacje = firstName + " jest w wieku: " + age + " lat. Stanowisko: " + job.getPosition()
                + ". Wynagrodzenie: " + job.getSalary() + " PLN. Obowiązki powyżej.\n";
        System.out.println(informacje);
    }
//        String informacje = firstName + " w wieku: " + age + job.describeResponsibilities();
    public static void main(String[] args) {
        Person person1 = new Person("Antonina", 49, new Director(25000, "dyrektor"));
        person1.personalDetails();

        Person person2 = new Person("Adam" , 25 , new Assistant(2500, "asystent"));
        person2.personalDetails();

        Person person3 = new Person("Eryk" , 33 , new SalesPerson(4700, "sprzedawca"));
        person3.personalDetails();

        Person person4 = new Person("Joanna" , 39 , new Accountant(9700, "księgowa"));
        person4.personalDetails();

    }


}
