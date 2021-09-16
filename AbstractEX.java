public class AbstractEX{
    public static void main(String[] args){
            SBI sbi=new SBI();
            sbi.open_Account();
            sbi.cal_interest();
            sbi.close_Account();

            System.out.println("..........................");  
                
            Canara canara=new Canara();
            canara.open_Account();
            canara.cal_interest();
            canara.close_Account();
    } 
}         
    abstract class RBI{
        public void open_Account(){
          System.out.println("opend Account successfully");
        }
        public void close_Account(){
          System.out.println("closed Account successfully");
        }
      public abstract int cal_interest();

    }    
    class SBI extends RBI{

        public int cal_interest(){

          System.out.println("Canara interest rate are : 0");

         return 0; 
        }
    }   
    class Canara extends RBI{  

        public int cal_interest(){

          System.out.println("Canara interest rate are : 8");

         return 8;
        }
    }    
  
 

