package SoftwareEStimation;

public class TFC extends Calculation {
	
    double factor;
    
    public TFC(double factor){
        this.factor=factor;
    }
    
    
    public double getfactor(){
        return factor;
    }
    
     
     public double gettotalfactor(){
         return (0.01 * factor) + 0.6 ;
     }

}
