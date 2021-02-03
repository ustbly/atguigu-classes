package com.atguigu.bigdata.test;

/**
 * @author LinYue
 * @email ustb2021@126.com
 * @create 2021-02-02 16:56
 */
public class Java09_Override {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        System.out.println(aaa.getRes());

        // 动态绑定机制
        // 成员方法在执行的过程中,JVM会将方法和当前调用对象实际内存进行绑定
        // 属性没有动态绑定机制,属性在哪里声明就在哪里使用
        AAA aaa1 = new BBB();
        System.out.println(aaa1.getRes());
    }

}

class AAA {
    private int i = 10;

    public int getRes() {
        return getI() + 10;// 遵循动态绑定机制,先看aaa1(BBB)里是否有getI(),有的话则会用,没有就用父类的getI()
    }

    public int getI() {
        return i;
    }
}

class BBB extends AAA {
    private int i = 20;

    public int getI() {
        return i;
    }

    public int getRes() {
        return i + 20;
    }
}