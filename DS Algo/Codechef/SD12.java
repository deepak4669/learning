import java.util.Scanner;
public class SD12
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long t=sc.nextInt();
    while(t-->0)
    {
      long n=sc.nextLong();
      long[] a=new long[(int)n+1];
      a[0]=0;
      for(int i=1;i<=n;i++)
      {
        long x=sc.nextLong();
        a[i]=a[i-1]+x;
      }
      long count=n-1;
      long f=1;
      long ans=0;
      while(count>0)
      {
        count-=a[(int)f];
        if(f+a[(int)f]<=n)
          f+=a[(int)f];
        ans++;
      }
      System.out.println(ans);
      
      
    }
  }
}
      
        