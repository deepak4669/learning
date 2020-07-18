import java.util.Scanner;
public class Main927
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int degree=sc.nextInt();
      int[] a=new int[degree+1];
      for(int i=0;i<(degree+1);i++)
        a[i]=sc.nextInt();
      int d=sc.nextInt();
      int k=sc.nextInt();
      int x=0;
      int sum=0;
      while(true)
      {
        sum+=(++x)*d;
        if(sum>=k) break;
      }
      long ans=pol(degree,a,x);
      System.out.println(ans);
    }
  }
  public static long pol(int degree,int[] a,int x)
  {
    long result=0;
    for(int i=0;i<=degree;i++)
    {
      result+=a[i]*(long)Math.pow(x,i);
    }
    return result;
  }
}
  
        