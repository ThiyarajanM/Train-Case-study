
package tc;
import java.util.*;
public class Tc {
 public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String departuretimes[]=new String[]{"MONDAY 6.04","MONDAY 9.04","MONDAY 12.04","MONDAY 15.04","MONDAY 19.04",
                                           "TUESDAY 6.04","TUESDAY 9.04","TUESDAY 12.04","TUESDAY 15.04","TUESDAY 19.04",
                                           "WEDNESDAY 6.04","WEDNESDAY 9.04","WEDNESDAY 12.04","WEDNESDAY 15.04","WEDNESDAY 19.04"};
      int passengers[] = new int[]{22,119,64,177,21,22,111,87,193,22,11,107,93,162,42};
      String trname2,trname1,n=" ";
      int total1,total2;
      System.out.println("\t\tTRAIN CASE STUDY");
      System.out.println("\t\t****************");
      for(int k=0;k<30;k++){
      total1=total2=0;
      trname1=trname2=" ";
      System.out.println("Enter n for option...(a to j)");
      n=sc.nextLine();
      switch(n){
          case "a":  System.out.println("a). ALL TRAINS LIST");
                     System.out.println("DAY\tDEPARTURE TIME\tNO. OF PASSENGERS");
                       for(int i=0;i<15;i++){
                            System.out.println(departuretimes[i]+"\t\t"+passengers[i]);
                                } 
                       break;
          case "b": System.out.println("b). MOST POPULAR TRAIN");
                     int big=0;
                    for(int i=0;i<15;i++){
                             if(passengers[i]>big){
                                 big=passengers[i];
                                 trname1=departuretimes[i];
                             } 
                    }
                     System.out.println("The Most Popular Train is "+trname1+" train \n Because the train contains more number of passengers "+big);
                     break;
        case "c":  System.out.println("c). LEAST POPULAR TRAIN");
                    int small=500;
                         for(int i=0;i<15;i++){
                             if(passengers[i]<small){
                                 small=passengers[i];
                                 trname1=departuretimes[i];
                             }
                         }
                     System.out.println("The Least Popular Train is "+trname1+" train \n Because the train contains some number of passengers "+small);
                     break;
        case "d":   System.out.println("d). WHETHER 6.04 TRAIN MORE POPULAR THAN 9.04 TRAIN");
                    for(int i=0;i<15;i++){
                            if("MONDAY 6.04".equalsIgnoreCase(departuretimes[i])||"TUESDAY 6.04".equalsIgnoreCase(departuretimes[i])||"WENDESDAY 6.04".equalsIgnoreCase(departuretimes[i])){
                                total1+=passengers[i];
                            }
                            if("MONDAY 9.04".equals(departuretimes[i])||"TUESDAY 9.04".equals(departuretimes[i])||"WEDNESDAY 9.04".equals(departuretimes[i])){
                                total2+=passengers[i];
                            }
                                }
                    
                     if(total1>total2){
                         System.out.println("The Most Popular Train is  6.04 Train Because The Train contains more number of passengers "+total1);
                     }
                     else
                     {
                         System.out.println("The Most Popular Train is  9.04 Train Because The Train contains more number of passengers "+total2);
                     }
                     break;
        case "e":   System.out.println("e). WHETHER 6.04 TRAIN ON MONDAY MORE POPULAR THAN 6.04 TRAIN ON TUESDAY");
                    for(int i=0;i<15;i++){
                            if("MONDAY 6.04".equals(departuretimes[i])){
                                total1=passengers[i];
                            }
                            if("TUESDAY 6.04".equals(departuretimes[i])){
                                total2=passengers[i];
                            }
                     }
                    if(total1>total2){
                          System.out.println("The Most Popular Train is Monday 6.04 Train Because The Train contains more number of passengers "+total1);
                    }
                    if(total1<total2)
                    {
                          System.out.println("The Most Popular Train is Tuesday 6.04 Train Because The Train contains more number of passengers "+total2);
                    }
                    if(total1==total2){
                          System.out.println("No Train is More Popular Because These Two Trains contains equal no.of Passengers "+total1);
                    }
                    break;
        case "f":   System.out.println("f). FIND MORE POPULAR TRAIN DAY/TIME SPECIFIED BY THE USER");
                    System.out.println("Enter day and time1...");
                    trname1=sc.nextLine();
                    System.out.println("Enter day and time2...");
                    trname2=sc.nextLine();
                    for(int i=0;i<15;i++){
                            if(departuretimes[i].equalsIgnoreCase(trname1)){
                                total1+=passengers[i];
                            }
                            if(departuretimes[i].equalsIgnoreCase(trname2)){
                                total2+=passengers[i];
                            }
                        }
                    if(total1>total2){
                          System.out.println("The Most Popular Train is "+trname1+" Train Because The Train contains more number of passengers "+total1);
                    }
                    if(total1<total2)
                    {
                          System.out.println("The Most Popular Train is "+trname2+" Train Because The Train contains more number of passengers "+total2);
                    }
                    if(total1==total2){
                          System.out.println("No Train is More Popular Because "+trname1+" and "+trname2+ " contains equal no.of Passengers "+total1);
                    }
                    break;
        case "g":   System.out.println("g). PASSENGERS BELOW 50");
                     System.out.println("DAY\tDEPARTURE TIME\tNO. OF PASSENGERS");
                    for(int i=0;i<15;i++){
                            if(passengers[i]<50){
                          System.out.println(departuretimes[i]+"\t\t"+passengers[i]);
                            }
                    }
                    break;
        case "h":   System.out.println("h). 12.04 TIME TRAIN'S AVERGAE NO.OF PASSENGERS");
                 
                   for(int i=0;i<15;i++){
                            if("MONDAY 12.04".equalsIgnoreCase(departuretimes[i])||"TUESDAY 12.04".equalsIgnoreCase(departuretimes[i])||"WEDNESDAY 12.04".equalsIgnoreCase(departuretimes[i])){
                              total1+=passengers[i];  
                            }
                   }
                    System.out.println("The Average number of passengers are "+total1/3);
                    break;
        case "i": System.out.println("i). AVERAGE NO.OF PASSENGERS BY USER SPECIFIED");
                  System.out.println("Enter day and time..");
                 trname1=sc.nextLine();
                 for(int i=0;i<15;i++){
                          if(trname1.equalsIgnoreCase(departuretimes[i])){
                              total1=passengers[i];
                          }
                      }
                  System.out.println("The Average number of passengers are "+total1);
                  break;
        case "j": System.exit(0);  break;
          default: System.out.println("Invalid Strings");
      } 
    }
 }
}