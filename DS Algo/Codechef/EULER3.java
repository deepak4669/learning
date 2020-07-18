import java.util.Scanner;
public class EULER3
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      long n=sc.nextLong();
      long m=n;
      for(long i=m;i>=2;i--)
      {
        if(prime(i)&&(m%i)==0)
        {
          m=i;
          break;
        }
      }
      System.out.println(m);
    }
  }
  public static boolean prime(long n)
  {
    for(long i=2;i<=(n/i);i++)
      if(n%i==0) return false;
    return true;
  }
}
    
