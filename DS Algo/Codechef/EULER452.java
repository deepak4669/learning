import java.util.Scanner;
public class EULER452
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int i=144;
    long ans=0;
    while(true)
    {
      long val=i*(2*i-1);
      if(pentagonal(val))
      {
        ans=val;
        break;
        
      }
      i++;
    }
    System.out.println(ans);
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
      