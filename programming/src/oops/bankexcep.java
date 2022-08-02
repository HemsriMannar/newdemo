package oops;
class Amountmin extends Exception{
    public Amountmin(String str) {
        super (str);
    }
}
public class bankexcep  {
     static void validate(int amount)throws Amountmin{
        if(amount<10000) {
            throw new Amountmin(" not have enough amount");
        }
        else 
            System.out.println("transaction successfull");
        }
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            validate(1500);
        }
        catch(Amountmin e) {
            e.printStackTrace();
            
        }
    }
}

