package com.atguigu.bigdata.test;

/**
 * @author LinYue
 * @email ustb2021@126.com
 * @create 2021-02-03 14:11
 */
public class Java11_Interface1 {
    public static void main(String[] args) {
        A11 a = new C11();
        System.out.println(C11.class.getInterfaces().length);//0
    }
}


interface A11 {

}

//B11实现了A11接口
class B11 implements A11 {

}

//C11继承了B11，但是没有实现A11接口
class C11 extends B11 {

}