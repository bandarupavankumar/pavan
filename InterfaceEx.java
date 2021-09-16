public class InterfaceEx{
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
    class SBI implements RBIInterfaceEX{
      public void open_Account(){
        System.out.println("open_account open successfully");
      }
      public void close_Account(){
        System.out.println("close_account open successfully");
      }
      public  int cal_interest(){
        System.out.println("SBI interest are -7");
          return 0;
      }
    }  
    class Canara implements RBIInterfaceEX{
         public void open_Account(){
          System.out.println("open_account open successfully");
        }
         public void close_Account(){
          System.out.println("close_account open successfully");
        }
         public int cal_interest(){
         System.out.println("Canara interest are -7");
          return 0;   
         }
    }

    