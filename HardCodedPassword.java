package com.iamgagansuri;

public class HardCodedPassword {

    public void login() {
        String userName = "gagan";
        String pwd = "atom";
        boolean loggedIn = authenticate(userName,pwd);
        System.out.println("logged in successfully"+loggedIn);
    }

    public boolean authenticate(String user,String password) {
        return user.equals("gagan") && user.equals("atom");

    }

}
