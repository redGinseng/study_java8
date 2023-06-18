package me.whiteship.java8to11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Foo {

    public static void main(String[] args) {
//        RunSomething runSomething = new RunSomething() {
//            @Override
//            public void doIt() {
//                System.out.println("Hello");
//            }
//        };

        // 함수형 인터페이스는 단일 추상 메서드를 가진 인터페이스다
        // 람다를 써서 훨씬 간결해진 코드
        RunSomething runSomething = () -> System.out.println("Hello");


        List<String> printStrs = Arrays.asList("Hello", "World");
        Consumer<String> printSomething = str -> System.out.println(str);
        printStrs.forEach(printSomething);


    }
}
