import java.util.*;
import java.util.Random;
class SuperOverBeta
{
    public static void main()
    {
        MainGame ob=new MainGame();
        ob.mgm();
    }
    
}

class MainGame
{
    
    public void mgm()
    {
        Scanner in =new Scanner(System.in);
        Random out =new Random();
       System.out.println("Welcome To Super Over");
       System.out.println("Choose Your Team And Opponent Team");
       String a=in.next();
       String b =in.next();
       System.out.println(a+" VS "+b);int bat,bowl;int c=0;;
       System.out.println("Your Are Now Batting");int runs=0;int x;int wkts=0;
       for(int i=0;i<12;i++)
       {
           System.out.println();
           bowl=out.nextInt(6-1+1)+1;
           System.out.println("Enter 0-6");
           x=in.nextInt();
           if(i==3||i==5||i==4||i==11||i==10||i==9)
           {
               bowl=out.nextInt(6- 4+ 1) + 4;
               
               
           }
           if(x==6)
           {
              c++; 
           }
           if(c>=7)
           {
               bowl=6;
           }
           if(x==bowl)
           {
               System.out.println("Oops You are Out!");++wkts;
           }
           else
           {
           runs=runs+x; 
           if(x==6)
           System.out.println("BALL GAYI SEEMA REKHA KE BAHAR DARSHAK BANE FIELDER !");
           if(x==4)
           System.out.println("Cracking shot! the ball races away to the boundary for FOUR!");
        
        }
        System.out.println("                        "+a+" Scores "+runs+" runs at "+(i+1)+" balls");
       }
       System.out.println(a+"'s score is-"+runs+"/"+wkts);
       System.out.println(b+" need "+(runs+1)+" in 2 overs");
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println("You are now bowling");
       int bruns=0;int bwkts=0;
       for(int i=0;i<12;i++)
       {
           bat=out.nextInt(6-1+1)+1;
           System.out.println("Enter 0-6");
           x=in.nextInt();
           if(i==3||i==5||i==4||i==9||i==10||i==11)
           {
               bat=out.nextInt(6- 4+ 1) + 4;
               
               
           }
           if(x==bat){
           System.out.println("BATSMAN OUT,LAGTA HAI AAJ WARMUP KRKE NAHI AAYE HAI!");++bwkts;
        }
           else
           bruns=bruns+bat;
           System.out.println(b+" Scores "+bruns+" runs at "+(i+1)+" balls");
           if(bruns>runs)
           break;
           System.out.println(b+" needs "+(runs+1-bruns)+" runs in "+(12-i-1)+" balls");
           
           
       }
       System.out.println(b+"'s score is-"+bruns+"/"+bwkts);
       if(bruns>runs)
       System.out.println(b+" won the match by "+(10-bwkts)+" wickets" );
       if(bruns<runs)
       System.out.println(a+" won the match by "+(runs-bruns)+" runs");
       
    }

}