import java.util.Scanner;
public class Main433A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    int two=0;
    int one=0;
    for(int i=0;i<n;i++)
    {
      int x=sc.nextInt();
      if(x==200) two++;
      else one++;
      sum+=x;
    }
    //System.out.println(sum);
    //System.out.println(one);
    //System.out.println(two);
    if(n==1)
      System.out.println("NO");
    else
    {
     //sum=sum/100;
     if(sum%200==0)
     {
       sum/=2;
       if(two==0)
       {
         System.out.println("YES");
       }
       else
       {
         if(two%2==0)
         {
           if(one%2==0)
             System.out.println("YES");
           else
             System.out.println("NO");
         }
         else
         {
           if(one<2) System.out.println("NO");
           else if((sum-((two/2)+1)*200)==(100*((one-2)/2)))
             System.out.println("YES");
           else
             System.out.println("NO");
         }
       }
     }

     else
       System.out.println("NO");
    }
  }
}
          
 
    