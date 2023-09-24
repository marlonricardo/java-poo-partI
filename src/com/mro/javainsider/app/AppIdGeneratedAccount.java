package com.mro.javainsider.app;

import com.mro.javainsider.account.IdGeneratedAccount;

public class AppIdGeneratedAccount {
    public static void main(String[] args) {
        var a1 = new IdGeneratedAccount("Marlon Ricardo");
        System.out.println(a1.getNumber());

        var a2 = new IdGeneratedAccount("Adriano Junior");
        System.out.println(a2.getNumber());

        var a3 = new IdGeneratedAccount("Adriano Junior");
        System.out.println(a3.getNumber());
    }
}
