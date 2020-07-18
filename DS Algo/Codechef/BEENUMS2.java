import java.util.Scanner;
public class BEENUMS2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    while(true)
    {
      long n=sc.nextLong();
      if(n==-1) break;
      long lo=1;
      long hi=n;
      long mid=(lo+hi)/2;
      while(lo<=hi)
      {
        mid=((lo+hi)/2);
        long f=(3*mid)*(mid-1)+1;
        if( f>n) hi=mid-1;
        else if(f<n) lo=mid+1;
        else break;
      }
      if(hi>=lo) System.out.println("Y");
      else System.out.println("N");
    }
  }
}