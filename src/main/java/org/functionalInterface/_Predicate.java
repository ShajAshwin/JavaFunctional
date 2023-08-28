package org.functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        Predicate<String> predicate = p->p.startsWith("+91") && p.length()>10;
        Predicate<String> contains9 = p->p.contains("9");

        System.out.println(predicate.and(contains9).test("91002345678"));
        System.out.println(predicate.and(contains9).test("+31002345678"));
        System.out.println(predicate.test("+91002345678"));
    }
}
