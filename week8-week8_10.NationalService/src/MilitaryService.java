public class MilitaryService {
   private int daysLeft;
   
   public MilitaryService (int daysLeft) {
       this.daysLeft = daysLeft;
   }
    
   public int getDaysLeft () {
         return this.daysLeft; 
     }
     
     public void work() {
         while (daysLeft >= 0) {
             daysLeft--;
         }
     }
}
