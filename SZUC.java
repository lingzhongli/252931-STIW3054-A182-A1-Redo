package SoftwareEStimation;

public class SZUC extends Calculation {
	
    double uupc,tcf;
    
   public SZUC(double uupc, double tcf){
       this.uupc=uupc;
       this.tcf=tcf;
   }
   
   
   public double getuupc(){
       return uupc;
   }
   
    public double gettcf(){
       return tcf;
   }
    
    public double getszuc(){
        return uupc*tcf;
    }

}
