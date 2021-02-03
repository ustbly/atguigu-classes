package com.atguigu.bigdata.test;

/**
 * @author LinYue
 * @email ustb2021@126.com
 * @create 2021-02-03 14:09
 */
public class Java10_Interface {
    public static void main(String[] args) {
        AAAA a = new AAAA();

    }
}

interface Test {
    int i = 10;
    //Java的接口中不能直接写逻辑代码
    //System.out.println("123")
}

class AAAA implements Test {
}