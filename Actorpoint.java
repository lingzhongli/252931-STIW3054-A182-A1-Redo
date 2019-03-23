package SoftwareEStimation;

public class Actorpoint extends Calculation {
	
	 int q1,q2,q3;
	    
	    public Actorpoint(int q1,int q2,int q3){
	        this.q1=q1;
	        this.q2=q2;
	        this.q3=q3;    
	    }
	  
	    public int getq1(){
	        return q1;
	    }
	    
	        
	    public int getq2(){
	        return q2;
	    }
	    
	        
	    public int getq3(){
	        return q3;
	    }
	    
	    public int getactorpoint(){
	        return (q1*1)+(q2*2)+(q3*3);
	    }

}
