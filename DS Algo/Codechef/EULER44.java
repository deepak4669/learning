import java.util.Scanner;
public class EULER44
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long ans=0;
    long p=0;
    long q=0;
    boolean flag=false;
    for(int i=2;!flag;i++)
    {
      long n=(i*(3*i-1))/2;
      for(int j=i-1;j>0;j--)
      {
        long m=(j*(3*j-1))/2;
        if(pentagonal(n+m)&&pentagonal(n-m))
        {
          ans=n-m;
          flag=true;
          p=i;
          q=j;
          break;
        }
      }
    }
    System.out.println(ans+" "+p+" "+q);
  }
  public static boolean pentagonal(long v)
  {
    long hi=100000000;
    long lo=0;
    while(hi>=lo)
    {
      long mid=(lo+hi)/2;
      long f=(3*mid*mid-mid)/2;
      if(f==v) return true;
      else if(f>v) hi=mid-1;
      else if(f<v) lo=mid+1;
    }
    return false;
  }
}