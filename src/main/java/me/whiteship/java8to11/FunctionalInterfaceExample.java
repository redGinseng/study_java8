package me.whiteship.java8to11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterfaceExample {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Predicate<T>는 제네릭 타입 T를 입력으로 받아서 불리언 값을 반환하는 함수형 인터페이스. 주로 조건을 검사하는 데 사용
        // 짝수인지 검사하는 Predicate
        Predicate<Integer> isEven = num -> num % 2 == 0;

        // numbers 리스트에서 짝수만 필터링
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);  // 출력: [2, 4, 6, 8, 10]


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // 각 이름을 출력하는 Consumer
        // Consumer<T>는 제네릭 타입 T를 입력으로 받아서 아무런 결과를 반환하지 않는 함수형 인터페이스
        Consumer<String> printName = name -> System.out.println(name);

        // names 리스트의 각 요소에 대해 Consumer 적용
        names.forEach(printName);

        // 람다 표현식을 직접 사용하여 간단하게 표현할 수도 있습니다.
        names.forEach(name -> System.out.println(name));
    }
}
