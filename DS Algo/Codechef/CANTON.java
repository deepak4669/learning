import java.util.Scanner;
public class CANTON
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int a=sc.nextInt();
      
      int count=0;
      int x=1;
      String ans="";
      while(count<a)
      {
        for(int i=1;i<=x;i++)
        {
          if(x%2==0)
          {
            ans=(i)+"/"+(x-i+1);
            count++;
            if(count==a) break;
          }
          else
          {
            ans=(x-i+1)+"/"+(i);
            count++;
            if(count==a) break;
          }
        }
        x++;
      }
      System.out.println("TERM "+a+" IS "+ans);
    }
  }
}
    
          