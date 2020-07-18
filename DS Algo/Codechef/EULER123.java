import java.util.Scanner;
import java.util.Arrays;
public class EULER123
{
  static int f=1000000;
  static boolean[] prime=new boolean[f+1];
  public static void preprocess()
  {
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    int m=(int)Math.sqrt(f);
    for(int i=2;i<=m;i++)
    {
      if(prime[i])
      {
        for(int j=i*i;j<=f;j+=i)
          prime[j]=false;
      }
    }
  }
  public static int NOD(long n)
  {
    int ans=1;
    long aux=n;
    for(int i=2;i<=n;i++)
    {
      int exp=1;
      if(prime[i])
      {
        if(i*i>aux) return 2*ans;
        while(aux%i==0)
        {
          exp++;
          aux/=i;
        }
        ans*=exp;
        if(aux==1) return ans;
      }
    }
    return ans;
  }
      
          
    
     
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    preprocess();
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      long k=1;
      long val=0;
      while(true)
      {
        val=(k*(k+1))/2;
        if(NOD(val)>n) break;
        k++;
      }
      System.out.println(val);
    }
  }
}
    
                            
                            