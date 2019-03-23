package SoftwareEStimation;
import java.util.*;
public class Calculation {
	
public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
         
         int q1=0 , q2=0 , q3=0;
         int x = 1;
         

        System.out.println("1. Calculate Actor Point\n");

        do {
            try {
                System.out.print("Defined Application Programming Interface (API): ");
                q1 = scan.nextInt();

                System.out.print("Interactive or Protocol driven interface(TCP/IP): ");
                q2 = scan.nextInt();

                System.out.print("Graphical User Interface (GUI): ");
                q3 = scan.nextInt();

                System.out.println();
                
                
   
                x = 2;
            } catch (InputMismatchException ex) {
                System.out.println("ERROR:Number Only! Please input again.");
                scan.next();
            }
        } while (x == 1);
        
                Actorpoint ap =new Actorpoint(q1,q2,q3);
                System.out.println("Total Actor Point:"+ ap.getactorpoint());
        
           
           
           
           
           System.out.println("\n2. Calculate Weight Use Case\n");
        do {
            try {
                System.out.print("3 or fewer transactions (Simple): ");
               q1 = scan.nextInt();

                System.out.print("4 to 7 transactions (Average): ");
                q2 = scan.nextInt();

                System.out.print("Greater than 7 transactions (Complex): ");
                q3 = scan.nextInt();

                System.out.println();
                
                
                x = 2;
            } catch (InputMismatchException ex) {
                System.out.println("ERROR:Please enter number only!");
                scan.next();
                x=1;
            }
        } while (x == 1);
        
                Usecase uc =new Usecase(q1,q2,q3);
                System.out.println("Total Actor Point:"+ uc.getusecasepoint());
                
                
          int actor=ap.getactorpoint();
          int use=uc.getusecasepoint();
          UUPC uupc=new UUPC(actor,use);
          System.out.println("\nUUPC: "+ uupc.getuupc()+ "\n");
          
          
          
          int t1=0, t2=0, t3=0,t4=0,t5=0,t6=0,t7=0,t8=0,t9=0,t10=0,t11=0,t12=0,t13=0;
          System.out.println("3. Calculate Weight Technical Factor\n");

        do {
            try {
                System.out.print("T1 = Must have distributed solution ");
                t1 = scan.nextInt();
                if ((t1> 5) || (t1 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("T2 = Must respond to specific performance bjectives ");
                t2 = scan.nextInt();
                if ((t2> 5) || (t2 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("T3 = Must meet end-user efficiency desires ");
                t3 = scan.nextInt();
                if ((t3> 5) || (t3 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("T4 = Complex internal processing ");
                t4 = scan.nextInt();
                if ((t4> 5) || (t4 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("T5 = Code must be reusable ");
                t5 = scan.nextInt();
                if ((t5> 5) || (t5 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("T6 = Must be easy to install ");
                t6 = scan.nextInt();
                if ((t6> 5) || (t6 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("T7 = Must be easy to use ");
                t7 = scan.nextInt();
                if ((t7> 5) || (t7 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("T8 = Must be portable ");
                t8 = scan.nextInt();
                if ((t8> 5) || (t8 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("T9 = Must be easy to change ");
                t9 = scan.nextInt();
                if ((t9> 5) || (t9 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("T10= Must allow concurrent users ");
                t10 = scan.nextInt();
                if ((t10> 5) || (t10 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("T11= Includes special security features ");
                t11 = scan.nextInt();
                if ((t11> 5) || (t11 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("T12= Must provide direct access for 3rd parties ");
                t12 = scan.nextInt();
                if ((t12> 5) || (t12 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("T13= training facilities ");
                t13 = scan.nextInt();
                    if ((t13> 5) || (t13 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                    x = 1;
                }
             catch (InputMismatchException ex) {
                System.out.println("ERROR:Please enter number only!");
                scan.next();
                x = 2;
            } catch (Exception ex) {
                System.out.println("ERROR: 1-5 ONLY");
                x = 2;
            }
        } while (x == 2);

        TFactor tf=new TFactor(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13);
        System.out.print("\nTotal T Factor = " + tf.gettotaltfactor() + "\n");
        
        double factor=tf.gettotaltfactor();
        
        TFC tfc=new TFC(factor);
        System.out.println("\nTFC: "+tfc.gettotalfactor());
        
        
        double uupc2=uupc.getuupc();
        double tfc2=tfc.gettotalfactor();
        SZUC szuc= new SZUC(uupc2,tfc2);
        
        System.out.printf("\nSzUC:%.2f%n ",szuc.getszuc());
        System.out.println("");
        
        
          int e1=0, e2=0, e3=0,e4=0,e5=0,e6=0,e7=0,e8=0;
          System.out.println("4. Calculate Weighting Experience Factors\n");

        do {
            try {
                System.out.print("E1 = Familiar with FPT software process ");
                e1 = scan.nextInt();
                if ((e1> 5) || (e1 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("E2 = Application experience ");
                e2 = scan.nextInt();
                if ((e2> 5) || (e2 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("E3 = Paradigm experience (OO) ");
                e3 = scan.nextInt();
                if ((e3> 5) || (e3 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("E4 = Lead analyst capability ");
                e4 = scan.nextInt();
                if ((e4> 5) || (e4 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("E5= Motivation ");
                e5 = scan.nextInt();
                if ((e5> 5) || (e5 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("E6 = Stable Requirements ");
                e6 = scan.nextInt();
                if ((e6> 5) || (e6 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("E7 = Part-time workers ");
                e7 = scan.nextInt();
                if ((e7> 5) || (e7 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
                System.out.print("E8 = Difficulty of programming language ");
                e8 = scan.nextInt();
                if ((e8> 5) || (e8 < 0)) {
                        throw new Exception("1-5 ONLY");
                    }
     
                    x = 1;
                }
             catch (InputMismatchException ex) {
                System.out.println("ERROR:Please enter number only!");
                scan.next();
                x = 2;
            } catch (Exception ex) {
                System.out.println("ERROR: 1-5 ONLY");
                x = 2;
            }
        } while (x == 2);
        
        
        EFactor ef= new EFactor(e1,e2,e3,e4,e5,e6,e7,e8);
        System.out.print("\nTotal E Factor = " + ef.gettotalefactor() + "\n");
        
        double Efactor=ef.gettotalefactor();
        EF ef2=new EF(Efactor);
        System.out.printf("\nEF:%.2f%n ",ef2.gettotalEfactor());
        
        double szuc2=szuc.getszuc();
        double ef3=ef2.gettotalEfactor();
        UPC upc=new UPC(szuc2,ef3);
        System.out.printf("\nUPC:%.3f%n ",upc.getupc());
        
        System.out.println("");
        System.out.println("5. Determine the effort rate\n");
        System.out.println("1. 20 man-hours per UCP");
        System.out.println("2. 28 man-hours per UCP");
        System.out.println("Please chose one from above:");
        int er=scan.nextInt();
        
        
        double upc2=upc.getupc();
        total_man_hours tmh=new total_man_hours(er,upc2);
        System.out.printf("\nTotal Man Hours:%.3f%n ",tmh.gettmh());
        
        
        System.out.println("\n6. Adjusted man-hours\n");
        double percentage = 0;
        do {
            try {
                System.out.print("Estimate percentage of risk(in %): ");
                percentage = scan.nextDouble();
                x = 2;
            } catch (InputMismatchException ex) {
                System.out.println("ERROR:Please enter number only!");
                scan.next();
            }
        } while (x == 1);
        
        double tmh2=tmh.gettmh();
        adjusted_man_hours amh=new adjusted_man_hours(percentage,tmh2);
        System.out.printf("\nAdjusted Man Hours:%.2f%n ",amh.getamh());
        
        
        System.out.println("");
        System.out.println("7.Weighting Reports for Complexity\n");
        System.out.println("Report Type:\n");
        do {
            try {
                System.out.print("Simple: ");
                q1 = scan.nextInt();
                System.out.print("Average: ");
                q2 = scan.nextInt();
                System.out.print("Complex: ");
                q3 = scan.nextInt();
                System.out.println("");
                x = 2;
            } catch (InputMismatchException ex) {
                System.out.println("ERROR:Please enter number only!");
                scan.next();
                x=1;
            }
        } while (x == 1);
        
        WeightReport wr =new WeightReport(q1,q2,q3);
        System.out.println("Total Report Man-hour Estimate:"+wr.getWR());
        
        double wr2=wr.getWR();
        double amh2=amh.getamh();
        Total_Man_Hours_Adjusted tmha=new Total_Man_Hours_Adjusted(wr2,amh2);
        System.out.printf("\nTotal Man Hours after Adjusted :%.2f%n ",tmha.gettmha());
            
        
    }

}
