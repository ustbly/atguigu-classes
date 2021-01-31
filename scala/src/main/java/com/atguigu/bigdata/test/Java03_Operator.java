package com.atguigu.bigdata.test;

/**
 * @author LinYue
 * @email ustb2021@126.com
 * @create 2021-01-30 19:05
 */
public class Java03_Operator {
    public static void main(String[] args) {
        int i = 0;
        i = i++;
        //1. _a = i++;
        //2. i = _a;
        //3. _a = 0;
        //4. i = _a = 0;
        System.out.println(i);
    }
}
