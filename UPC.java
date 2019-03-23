package SoftwareEStimation;

public class UPC extends Calculation {
	
    double szuc,ef;
    
   public UPC(double szuc, double ef){
       this.szuc=szuc;
       this.ef=ef;
   }
   
   
   public double getszuc(){
       return szuc;
   }
   
    public double getef(){
       return ef;
   }
    
    public double getupc(){
        return szuc*ef;
    }

}
