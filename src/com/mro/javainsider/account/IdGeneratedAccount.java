package com.mro.javainsider.account;

public class IdGeneratedAccount {
    public static final int INITIAL_VALUE = 10;
    private int number;
    private int agency;
    private String owner;
    private double balance;
    private static int currentId = INITIAL_VALUE; // atributo static, os objetos passam a enxergar pela classe, não por cada objeto

    //Initializing constructors
    //I added an empty constructor to allow me to instantiate it without setting parameters
    IdGeneratedAccount(){}

    public IdGeneratedAccount(int agency, int number, String owner, double balance){
        this.agency = agency;
        this.number = number;
        this.owner = owner;
        this.balance = balance;
    }

    public IdGeneratedAccount(String owner){
        String prefixo = "000";
        String resultado = prefixo + currentId++;
        this.number = Integer.parseInt(resultado);
        this.owner = owner;
        this.balance = 0.0;

    }
    public IdGeneratedAccount(int agency, int number, String owner){
        this(agency, number, owner, 0);
    }

    public IdGeneratedAccount(int agency, int number, double balance){
        this(agency, number, null, balance);
    }
    //Ending constructors


    //methods
    void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            throw new IllegalStateException("Você não pode despositar valores negativos...");
        }

    }

    void withdraw(double amount){
        if(balance - amount < 0){
            throw new IllegalStateException("Saldo insuficiente!");
        }
        balance -= amount;
    }

    void transfer(Account destNumber, double amount){
        withdraw(amount);
        destNumber.deposit(amount);
    }

    void printBalance(){
        System.out.println("======Initial Print Balance======");
        System.out.println("Owner: " + owner);
        System.out.println("Agency/com.mro.javainsider.exercims.Number: " + agency + " - " + number);
        System.out.println("Balance: R$" + balance);
        System.out.println("======End Print Balance======");
        System.out.println();
    }

    //ending methods




    //methods getters and setters
    public int getNumber() {
        return number;
    }

//    public void setNumber(int number) {
//        this.number = number;
//    }

    public int getAgency() {
        return agency;
    }

//    public void setAgency(int agency) {
//        this.agency = agency;
//    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
    //ending methods getters and setters
}
