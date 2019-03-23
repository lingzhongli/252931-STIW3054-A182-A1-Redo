package SoftwareEStimation;

public class TFactor extends Calculation {
	
	int t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;


    public TFactor(int t1,int t2,int t3,int t4,int t5,int t6,int t7,int t8,int t9,int t10,int t11,int t12,int t13){
        this.t1=t1;
        this.t2=t2;
        this.t3=t3;
        this.t4=t4;
        this.t5=t5;
        this.t6=t6;
        this.t7=t7;
        this.t8=t8;
        this.t9=t9;
        this.t10=t10;
        this.t11=t11;
        this.t12=t12;
        this.t13=t13;
        
    }
    
    
public int gett1(){
    return t1;
}

public int gett2(){
    return t2;
}
public int gett3(){
    return t3;
}
public int gett4(){
    return t4;
}
public int gett5(){
    return t5;
}
public int gett6(){
    return t6;
}
public int gett7(){
    return t7;
}
public int gett8(){
    return t8;
}
public int gett9(){
    return t9;
}
public int gett10(){
    return t10;
}
public int gett11(){
    return t11;
}
public int gett12(){
    return t12;
}
public int gett13(){
    return t13;
}

public double gettotaltfactor(){
    return (t1*2)+(t2*1)+(t3*1)+(t4*1)+(t5*1)+(t6*0.5)+(t7*0.5)+(t8*2)+(t9*1)+(t10*1)+(t11*1)+(t12*1)+(t13*1);
}

}
