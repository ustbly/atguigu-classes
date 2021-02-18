package com.atguigu.bigdata.test;

/**
 * @author LinYue
 * @email ustb2021@126.com
 * @create 2021-02-18 10:17
 */
public class Java15_Class1 {
    public static void main(String[] args) {
        test(Person15.class);
        test(User15.class);
        //test(Student15.class);

        test1(XXX15.class);
        test1(Person15.class);
        //test1(User15.class);
    }

    //只允许Person15和它的子类
    //extends体现了类的体系树的上限
    public static void test(Class<? extends Person15> c) {
        System.out.println(c);
    }

    //只允许Person15和它的父类
    //super体现了类的体系树的下限
    public static void test1(Class<? super Person15> c) {
        System.out.println(c);
    }
}
class XXX15 {

}
class Person15 extends XXX15 {

}

class User15 extends Person15 {

}

class Student15 {

}

