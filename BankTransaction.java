public class BankTransaction {
    
    double balance = 25000;
    double currentbalance;
    double transferAmount = 11000;
    double CurrentB;
    
   public void Deposit()
    {
        double selfDeposit = 15000,DepositAmount = 0;
         DepositAmount = balance + selfDeposit;
         System.out.println("Deposit: " + DepositAmount);
         currentbalance = DepositAmount;
    }
    void Transfer()
    {
        
       CurrentB =currentbalance - transferAmount;
        System.out.println("Transfer : " +CurrentB);
        System.out.println("Current Balance"+CurrentB);
        
    }

    
     void CalculateInterest(){
       double interestRate = 0.02; // 2%
        int months = 12;
        double interest = CurrentB * interestRate * months;

        System.out.println("Interest Value: " + interest);   
      }
     
     public static void main(String[] args){
         
         BankTransaction b=new BankTransaction();
         b.Deposit();
         b.Transfer();
         b.CalculateInterest();
         
     }
        
}