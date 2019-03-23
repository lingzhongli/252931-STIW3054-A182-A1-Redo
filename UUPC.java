package SoftwareEStimation;

public class UUPC extends Calculation {
	
    int actor,use;
    
    public UUPC(int actor, int use){
        this.actor=actor;
        this.use=use;
    }
    
    
    public int getactor(){
        return actor;
    }
    
     public int getuse(){
        return use;
    }
     
     public int getuupc(){
         return actor+use;
     }

}
