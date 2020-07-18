import java.util.Scanner;
import java.util.Arrays;
public class EULER7
{
  static boolean prime[]=new boolean[1000001];
  static void sieve(int n)
  {
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    int m=(int)Math.sqrt(n);
    for(int i=2;i<=m;i++)
    {
      if(prime[i])
      {
        for(int j=i*i;j<=n;j+=i)
          prime[j]=false;
      }
    }
  }
      
  public static void main(String[] args)
  {
    sieve(1000000);
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int count=0;
      int ans=2;
      for(int i=2;i<=1000000;i++)
      {
        if(prime[i])
        {
          if(++count==n){
            ans=i;
            break;
          }
              
        }
      }
      System.out.println(ans);
    }
  }
}
       
                       
      