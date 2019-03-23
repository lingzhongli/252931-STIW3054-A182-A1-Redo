package SoftwareEStimation;

public class EFactor extends Calculation {
	
	int e1,e2,e3,e4,e5,e6,e7,e8;


    public EFactor(int e1,int e2,int e3,int e4,int e5,int e6,int e7,int e8){
        this.e1=e1;
        this.e2=e2;
        this.e3=e3;
        this.e4=e4;
        this.e5=e5;
        this.e6=e6;
        this.e7=e7;
        this.e8=e8;

        
    }
    
    
public int gete1(){
    return e1;
}

public int gete2(){
    return e2;
}
public int gete3(){
    return e3;
}
public int gete4(){
    return e4;
}
public int gete5(){
    return e5;
}
public int gete6(){
    return e6;
}
public int gete7(){
    return e7;
}
public int gete8(){
    return e8;
}

public double gettotalefactor(){
    return (e1*1)+(e2*0.5)+(e3*1)+(e4*0.5)+(e5*0)+(e6*2)+(e7*-1)+(e8*-1);
}

}
