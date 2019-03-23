package SoftwareEStimation;

public class EF extends Calculation {
	
    double Efactor;
    
    public EF(double Efactor){
        this.Efactor=Efactor;
    }
    
    
    public double getEfactor(){
        return Efactor;
    }
    
     
     public double gettotalEfactor(){
         return (-0.03 * Efactor) + 1.4 ;
     }

}
