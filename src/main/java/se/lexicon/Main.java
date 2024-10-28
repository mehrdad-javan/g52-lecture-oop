package se.lexicon;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "X6", 2020);
        Car car2 = new Car("Volvo", "V60");
        Car car3 = new Car("Volvo", "XC60");

        Person p1 = new Person("Marcus Gudmondsun", LocalDate.parse("1989-01-01"));
        Person p2 = new Person("Simon Elbrink", LocalDate.parse("2000-01-01"));
        System.out.println(p1.getPersonInfo());
        System.out.println(p2.getPersonInfo());

        System.out.println("----------------------");
        car1.setOwner(p1);
        car2.setOwner(p1);

        System.out.println(car1.getCarInfo());
        System.out.println(car2.getCarInfo());
        System.out.println(car3.getCarInfo());


    }
}