import java.util.Scanner;
import java.util.Arrays;
public class EULER37
{
  static int n=1000000;
  static boolean[] prime=new boolean[n+1];
  static void preprocess()
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
        {
          prime[j]=false;
        }
      }
    }
  }
      
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    preprocess();
    int cnt=0;
    long ans=0;
    for(int i=10;i<=1000000;i++)
    {
      boolean flag=true;
      if(prime[i])
      {
        String s=i+"";
        for(int j=1;j<s.length();j++)
        {
          if(!prime[Integer.parseInt(s.substring(j,s.length()))])
          {
            flag=false;
            break;
          }
        }
        if(flag)
        {
          for(int j=s.length();j>0;j--)
          {
            if(!prime[Integer.parseInt(s.substring(0,j))])
            {
              flag=false;
              break;
            }
          }
        }
        if(flag)
        {
          cnt++;
          ans+=i;
        }
      }
    }
    System.out.println(cnt+" "+ans);
  }
}
          
        
    