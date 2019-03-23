package SoftwareEStimation;

public class WeightReport extends Calculation {
	
    int q1,q2,q3;
    
  public WeightReport(int q1,int q2,int q3){
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
  
  public int getWR(){
      return (q1*12)+(q2*20)+(q3*40);
  }

}
