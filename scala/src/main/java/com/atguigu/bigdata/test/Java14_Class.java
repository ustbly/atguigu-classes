package com.atguigu.bigdata.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LinYue
 * @email ustb2021@126.com
 * @create 2021-02-18 10:17
 */
public class Java14_Class {
    public static void main(String[] args) {
        //所谓的泛型，其实就是对类型的约束
        /*
        List<String> list = new ArrayList<String>();
        list.add("abc");

        String s = list.get(0);
        System.out.println(s);
        */

        /*
        List list1 = new ArrayList();
        list1.add(1);

        int i = list1.get(0);
        */

        //java中的泛型 不变性
        //List<Person14> person14 = new ArrayList<Person14>();

        //person14.add(new User14());  //User14 -> Person14

        //泛型的作用域，对声明泛型后的逻辑操作进行类型的约束，对之前的操作约束不了
        List list2 = new ArrayList();
        list2.add(new Student());

        List<Person14> person14List = list2;

        //System.out.println(person14List);

        for (Person14 person14 : person14List) {
            System.out.println(person14);   //ClassCastException
        }
    }
}

class Person14 {

}

class User14 extends Person14 {

}

class Student {

}

