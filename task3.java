import java.util.*;
class Bank
{
    int balance;
    Bank()
    {
        balance=0;
    }
    Bank(int n)
    {
        balance+=n;
    }
    int Balance()
    {
       return balance;
    }
    void withdrawl(int amount)
    {
        balance-=amount;
        System.out.println("Amount Withdrawed");
    }
    void Depo(int amount)
    {
        balance+=amount;
        System.out.println("Deposited Successfully......");
    }
}
class task3
{
    Bank account;
    boolean run;
   task3(Bank account)
    {
        this.account=account;
        this.run=true;
    }
    int c,balance,a,d;
    Scanner s=new Scanner(System.in);
    Bank acc;
    public void start()
    {
        while(run)
        {
            System.out.println();
            System.out.print("1.Check Balance \n2.Withdraw Money \n3.Deposite Money \n4.Exit \n\nEnter your choice: ");
            c=s.nextInt();
             System.out.println();
            switch(c)
            {
             case 1: checkBalance();
                     break;
             case 2: withdraw();
                     break;
             case 3: Deposite();
                     break;
             case 4: Exit();
                     break;
             default: System.out.println("Wrong Option");
            }
        }
    }
    void checkBalance()
    {
        System.out.println("Your Balance Is: "+account.Balance());
    }
    void  withdraw()
    {
        System.out.print("Enter Amount To Withdrawl: ");
        a=s.nextInt();
        if (account.Balance()<=0 || a>account.Balance())
        {
            System.out.println("Balance is low");
            System.out.println("Cannot Withdraw amount");
        }
        else
        {
            account.withdrawl(a);
        }
    }
    void Deposite()
    {
        System.out.print("Enter Amount for Deposite: ");
        d=s.nextInt();
        account.Depo(d);
    }
    void Exit()
    {
        run=false;
    }
public static void main(String[] args)
    {
        Bank account=new Bank(5000);
        task3 a=new task3(account);
        a.start();
    }
    
}