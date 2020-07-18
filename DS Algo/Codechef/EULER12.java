import java.util.Scanner;
public class EULER12
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      long k=1;
      long val=0;
      while(true)
      {
        
        val=(k*(k+1))/2;
        
        if(divisors(val)>n) break;
        k++;
      }
      System.out.println(val);
    }
  }
  public static int divisors(long n)
  {
    if(n==1) return 1;
    else
    {
      int ans=0;
      for(int i=1;i<=Math.sqrt(n);i++)
      {
        if(n%i==0)
        {
          ans++;
        }
        if(n/i!=i&&(n%i)==0)
        {
          ans++;
        }
      }
      return ans;
    }
  }
}
  
        
                     