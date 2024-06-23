import java.util.*;
class Task1
{
 public static void main(String[] args) 
 {
        int r1,r2,rnum,g,a;
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        r1=1;
        r2=100;
        rnum=r.nextInt(r2-r1+1)+r1;
        System.out.print("Guess a number:");
        g=s.nextInt();
         System.out.println();
        a=0;
        while (rnum!=g)
        { 
         if (a>=5) 
         {
             System.out.println("Your5 Atempts are wrong");
             System.out.println("The number is: "+rnum);
             break;
         }
         if (rnum!=g)
         {
          if (rnum>g) 
          {
            System.out.println("number is higher");
          }
          else if (rnum<g) 
          {
            System.out.println("number is lower");
          }
         }
         System.out.println();
          System.out.println("Attempt:"+(a+1));
         System.out.print("Again Guess Number:");
         g=s.nextInt();
         System.out.println();
         a+=1;
         if (rnum==g)
         {
             break;
         }
        }
        if (rnum==g) 
        {
            System.out.println("Guess Is Correct");
        }
    } 
}