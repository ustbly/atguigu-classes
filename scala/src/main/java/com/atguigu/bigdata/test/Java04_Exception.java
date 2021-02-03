package com.atguigu.bigdata.test;

/**
 * @author LinYue
 * @email ustb2021@126.com
 * @create 2021-02-01 16:03
 */
public class Java04_Exception {
    public static void main(String[] args) {
        try {
            int i = 10;
            int j = 0;
            int z = i / j;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException...");
        } catch (Exception e) {
            System.out.println("Exception...");
        } finally {
            System.out.println("finally....");
        }
    }
}
