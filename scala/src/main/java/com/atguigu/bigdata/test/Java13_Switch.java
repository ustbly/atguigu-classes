package com.atguigu.bigdata.test;

/**
 * @author LinYue
 * @email ustb2021@126.com
 * @create 2021-02-17 17:08
 */
public class Java13_Switch {
    public static void main(String[] args) {
        // Java中一个都不匹配,且没写default不会报错
        int i = 2;
        switch (i) {
        /*
        default:
            System.out.println("d");
            break;
        */
            case 0:
                break;
            case 1:
                System.out.println("1");
        }
    }
}
