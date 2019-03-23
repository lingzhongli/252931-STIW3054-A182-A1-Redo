package SoftwareEStimation;

public class Usecase extends Calculation {
	
	 int q1,q2,q3;
	    
	    public Usecase(int q1,int q2,int q3){
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
	    
	    public int getusecasepoint(){
	        return (q1*5)+(q2*10)+(q3*15);
	    }


}
