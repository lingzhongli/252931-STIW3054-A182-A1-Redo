package SoftwareEStimation;

public class Total_Man_Hours_Adjusted extends Calculation {
	
	   double amh,wr;
	    
	    public Total_Man_Hours_Adjusted(double amh, double wr){
	        this.amh=amh;
	        this.wr=wr;
	    }
	    
	    
	    public double getamh(){
	        return amh;
	    }
	    
	     public double getwr(){
	        return wr;
	    }
	     
	     public double gettmha(){
	         return amh+wr;
	     }

}
