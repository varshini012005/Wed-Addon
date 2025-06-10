package program;
class Acc{
    private String Accholder;
    private int Balance;
    Acc(String Accholder,int Balance){
        this.Accholder=Accholder;
        this.Balance=Balance;
    
    }
    public String getAccholder(){
        return Accholder;
        
    }
    public int getBalance(){
        return Balance;
    }
    public void Deposit(int dep){
        if(Balance>0){
            Balance += dep;
            System.out.println("Desposit Amount:"+dep);
            System.out.println("Now Current Balance:"+Balance);
        }
    }
    public void setAccholder(String Accholder){
        this.Accholder=Accholder;
    
    }
    public void setwithdraw(int withdraw){
        Balance -= withdraw;
    }
}
public class BankDetail{
    public static void main(String[] args){
     Acc ac=new Acc("sree",20000);
     System.out.println("Account holder name:"+ac.getAccholder());
     ac.setAccholder("sreevarshini");
     System.out.println("update account holder:"+ac.getAccholder());
     System.out.println("Balance:"+ac.getBalance());
     ac.Deposit(3000);
     ac.setwithdraw(30000);
 System.out.println();
     System.out.println("Available balance:"+ ac.getBalance());
}
}
