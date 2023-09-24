package com.mro.javainsider.others;

import com.mro.javainsider.account.*;

//fully qualified name

public class Main {
    public static void main(String[] args) {
        final Account conta1 = new Account(1645, 163708, "Marlon Ricardo");
        final CurrentAccount conta2 = new CurrentAccount(1645, 163334, "Adriano Junior", 16);

        conta1.printBalance();
        conta2.printBalance();

        conta1.deposit(15_000);
        conta1.printBalance();

        conta1.withdraw(3_000);
        conta1.printBalance();

        conta1.transfer(conta2, 5_000);
        conta1.printBalance();

        conta2.deposit(3_000);
        conta2.printBalance();


    }
}
