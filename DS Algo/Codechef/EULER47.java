import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
public class EULER47
{
  static int n=1000000;
  static PrintWriter out=new PrintWriter(System.out);
  static int[] a=new int[n+1];
  static boolean[] prime=new boolean[n+1];
  static void preprocess()
  {
    
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    int m=(int)Math.sqrt(n);
    for(int i=2;i<=n;i++)
    {
      if(prime[i])
      {
        for(int j=i*2;j<=n;j+=i)
        {
          a[j]+=1;
          prime[j]=false;
        }
      }
    }
  }
      
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    preprocess();
    int k=sc.nextInt();
    int ans=0;
    boolean flag=false;
    System.out.println(a[14]);
   
    for(int i=2;i<=n-k;i++)
    {
      int prev=a[i];
      // System.out.println(i);
      //int j=0;
      if(a[i]==k&&a[i+1]==k&&a[i+2]==a[i+1]&&a[i+3]==k)
      {
        ans=i;
        break;
      }
          
      
    }
    System.out.println(a[134043]+" "+a[134044]+" "+a[134045]+" "+a[134046]);
  }
}
    
          
          
    