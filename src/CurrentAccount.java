public class CurrentAccount extends Account{
    private final double monthTax = 15;

    //TODO check if it is possible making validations inside constructors.
    public CurrentAccount(int agency, int number, String owner, double balance){
        super(agency, number, owner, balance);
        if(balance - monthTax < 0){
            throw new IllegalStateException("Initial deposit should be R$" + monthTax + " at least...");
        }else{
            withdraw(monthTax);
        }
    }

}
