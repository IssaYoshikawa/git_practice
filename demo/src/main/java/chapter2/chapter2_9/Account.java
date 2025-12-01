
public class Account {
    private String accountNo;
    private int zandata;
    private AccountType accountType;

    public Account(String aNo, AccountType aType){
        this.accountNo = aNo;
        this.accountType = aType; 
    }

    public String getAccountNo(){
        return this.accountNo;
    }

    public int getZandaka(){
        return this.zandata;
    }

    public void setZandaka(int zandaka){
        this.zandata = zandaka;
    }

    public AccountType getAccountType(){
        return accountType;
    }

}
