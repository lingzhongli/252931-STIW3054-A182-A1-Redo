package SoftwareEStimation;

public class total_man_hours extends Calculation {
	
    double er,upc;
    
   public total_man_hours(double er, double upc){
       this.er=er;
       this.upc=upc;
   }
   
   
   public double getupc(){
       return upc;
   }
   
    public double geter(){
       return er;
   }
    
    public double gettmh(){
        return er*upc;
    }
   

}
