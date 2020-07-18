import java.util.Scanner;
import java.util.Arrays;
public class EULER102
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      boolean[] prime=new boolean[n+1];
      Arrays.fill(prime,true);
      prime[0]=false;
      prime[1]=false;
      int m=(int)Math.sqrt(n);
      long ans=0;
      for(int i=2;i<=n;i++)
      {
        if(prime[i])
        {
          if(i<=m){
          for(int j=i*i;j<=n;j+=i)
            prime[j]=false;
          }
          ans+=i;
        }
      }
      System.out.println(ans);
    }
  }
}
                     