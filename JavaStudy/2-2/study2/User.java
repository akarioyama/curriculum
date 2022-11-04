package study;

/**
 * User.java
 */

import study.User;

class User {
    private String userName;
    private int id;
    private String password;

    public User() {
        this.userName = "hoge";
        this.id = 123;
        this.password = "abc123";
    }

    protected void printAccountInfo() {
        System.out.println("ユーザー名は" + userName);
        System.out.println("IDは" + id);
        System.out.println("パスワードは" + password);

    }

}
