package me.whiteship.java8to11;


// 추상메서드가 하나만 있으면 함수형 인터페이스다
@FunctionalInterface
public interface TestFunctionalInterface {

//    void doIt();
    int doInt(int num);

}
