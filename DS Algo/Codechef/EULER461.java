import java.util.Scanner;
import java.util.*;
public class EULER461
{
  static int n=1000000;
  static boolean[] prime=new boolean[n+1];
  static boolean odd[]=new boolean[n+1];
  static void preprocess()
  {
    
    Arrays.fill(prime,true);
    Arrays.fill(odd,true);
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
    for(int i=3;i<=n;i+=2)
    {
      if(prime[i])
      {
        int k=1;
        int j=i+2*(k*k);
        while(j<=n)
        {
          //if(prime[j])
            odd[j]=false;
          k++;
          j=i+2*(k*k);
        }
      }
    }
  }
          
      
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int ans=0;
    preprocess();
    for(int i=3;i<=n;i+=2)
    {
      if(!prime[i]&&odd[i]){
        ans=i;
        break;
      }
    }
    System.out.println(ans);
  }
}
    