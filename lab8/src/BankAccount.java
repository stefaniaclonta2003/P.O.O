public class BankAccount {
    int sold;
    public BankAccount(int sold){
        this.sold = sold;
    }
    void retrageNumerar(int sum) throws FondInsuficient{
        if(sum> sold){
            throw new FondInsuficient("mesaj");
        }
    }

}
