package org.imapative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Imparative approach
        System.out.println("//Imparative approach");
        Person person1 = new Person("Shaj", Person.Gender.MALE);
        Person person2 = new Person("Ashwin", Person.Gender.MALE);
        Person person3 = new Person("Ashley", Person.Gender.FEMALE);

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        List<Person> males = new ArrayList<>();

        for (Person person : people){
            if (person.gender.equals(Person.Gender.MALE))
            males.add(person);

        }
        for (Person male : males){
            System.out.println(male);
        }

        //Declrative approach
        System.out.println("Declrative approach");

        people.stream()
                .filter(females -> Person.Gender.FEMALE.equals(females.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }


    public static class Person{

        public String name;
        public Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        enum Gender {
            MALE, FEMALE
        }
    }
}