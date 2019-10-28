package three.practice;

public class Bank {
    private String Account;
    private int balance;

    public Bank(String account, int balance) {
        this.setAccount(account);
        this.setBalance(balance);
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "账户:" + getAccount() + "  余额:" + getBalance();
    }
    public synchronized void saveAccount(){
        //在不同的位置添加 sleep 方法
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int balance = getBalance();

        balance = balance + 100;
        setBalance(balance);
        System.out.println("存款后的账户余额:" + getBalance());
    }
    public  void drawAccount(){
        synchronized(this){
            int balance = getBalance();

            //在不同的位置添加 sleep 方法
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = balance - 200;
            setBalance(balance);
            System.out.println("取款后的账户余额:" + getBalance());
        }
    }
}
