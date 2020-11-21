package com.atguigu.bigdata.test;

import java.lang.reflect.Field;

public class Java02_Var_2 {
    public static void main(String[] args) throws Exception {

        //字面量
        String name = "zhangsan";
        int i = 10;

//        String,StringBuffer,StringBuilder
//        String是不可变字符串，是因为它引用的地址不可变
        String s = " a b ";
//        s.trim();  //new String
//        System.out.println("!" + s + "!");
        Field field = s.getClass().getDeclaredField("value");
        field.setAccessible(true);

        char[] cs = (char[]) field.get(s);

        cs[2] = 'd';
        System.out.println(s);

    }

    

}
