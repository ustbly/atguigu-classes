package com.atguigu.bigdata.test;

/**
 * @author LinYue
 * @email ustb2021@126.com
 * @create 2021-02-03 16:33
 */
public class Java12_ObjectEq {
    public static void main(String[] args) {
        User12 user1 = new User12();
        User12 user2 = new User12();
        System.out.println(user1.equals(null));
    }
}


class User12 {

    private int id;
    private String name;

    // 重写hashCode主要是在HashMap中需要使用
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof User12) {
            User12 otherUser = (User12) o;
            return this.id == otherUser.id;
        } else {
            return false;
        }
    }
}
