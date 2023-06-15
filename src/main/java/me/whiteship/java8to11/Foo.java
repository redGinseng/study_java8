package me.whiteship.java8to11;

public class Foo {

    public static void main(String[] args) {

        // 람다 이전에 익명 내부 클래스 anonymous inner class
//        TestFunctionalInterface tfi = new TestFunctionalInterface() {
//            @Override
//            public void doIt() {
//                System.out.println("Hello");
//                System.out.println("Lambda");
//            }
//        };

//        TestFunctionalInterface tfi = () -> System.out.println("Hello");

        TestFunctionalInterface tfi = (number) -> {
            return number + 10;
        };

        // 함수형 인터페이스는 여러번 실행해도 결과값이 같아야한다.
        System.out.println(tfi.doInt(1));
        System.out.println(tfi.doInt(1));
        System.out.println(tfi.doInt(1));


//        // 함수 안에서 함수 바깥에 있는 값을 참조해서 쓰는 경우가 그렇다.
//        TestFunctionalInterface tfi = new TestFunctionalInterface() {
//            int baseNum = 10;
//
//            @Override
//            public int doInt(int num) {
//                baseNum++;
//                return num + baseNum;
//            }
//        };
//
//        System.out.println(tfi.doInt(1));
//        System.out.println(tfi.doInt(1));
//        System.out.println(tfi.doInt(1));

    }
}
