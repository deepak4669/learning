import java.util.Scanner;
public class EULER45
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long ans=0;
    for(int i=286;;i++)
    {
      System.out.println(i);
      long val=(i*(i+1))/2;
      if(hexagonal(val)&&pentagonal(val))
      {
        ans=val;
        break;
      }
      
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
      
  
  public static boolean hexagonal(long v)
  {
    long hi=100000000;
    long lo=0;
    while(hi>=lo)
    {
      long mid=(lo+hi)/2;
      long f=(2*mid*mid-mid);
      if(f==v) return true;
      else if(f>v) hi=mid-1;
      else if(f<v) lo=mid+1;
    }
    return false;
    
      
  }
}
        
      
      