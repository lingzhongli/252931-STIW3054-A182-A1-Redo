package SoftwareEStimation;

public class adjusted_man_hours extends Calculation {
	
    double tmh ,percentage;
    
    public adjusted_man_hours(double percentage,double tmh){
        this.tmh=tmh;
        this.percentage=percentage;
        
    }
    
    
    public double getmh(){
        return tmh;
    }
    public double getpercentage(){
        return percentage;
    }
    
     
     public double getamh(){
         return (1.0 + percentage/100) * tmh;
     }

}
