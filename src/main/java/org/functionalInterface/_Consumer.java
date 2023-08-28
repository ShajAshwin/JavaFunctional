package org.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main( String[] args){
        Customer maria = new Customer("Maria",5);

        consumer.accept(maria);
        biConsumer.accept(maria.name, false);

    }

    static Consumer<Customer> consumer = a -> System.out.println("Welcome " +a.name+ " Age " + a.age);

    static BiConsumer<String, Boolean> biConsumer = (a, b)->System.out.println("Welcome "+a+ " to "+(b?"abc Hotel":"**********"));

    public static class Customer{
         int age;
         String name;

        public Customer(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
