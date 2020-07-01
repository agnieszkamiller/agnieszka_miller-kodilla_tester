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
        String informacje = "\n" + firstName + " jest w wieku: " + age + " lat. Stanowisko: " + job.getPosition()
                + ". Wynagrodzenie: " + job.getSalary() + " PLN. Obowiązki:";
        System.out.println(informacje);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Antonina", 49, new Director(25000, "dyrektor"));
        person1.personalDetails();
        person1.job.showResp(1, 2);

        Person person2 = new Person("Adam", 25, new Assistant(2500, "asystent"));
        person2.personalDetails();
        person2.job.showResp(2, 3);

        Person person3 = new Person("Eryk", 33, new SalesPerson(4700, "sprzedawca"));
        person3.personalDetails();
        person3.job.showResp(3, 4);

        Person person4 = new Person("Joanna", 39, new Accountant(9700, "księgowa"));
        person4.personalDetails();
        person4.job.showResp(4, 5);

    }


}
