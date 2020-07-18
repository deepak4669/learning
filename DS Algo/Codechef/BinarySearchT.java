import java.util.Scanner;
public class BinarySearchT
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      System.out.println(valid(n));
    }
  }
  public static boolean valid(int t)
  {
    System.out.println(t);
    long hi=1000000;
    long lo=0;
    while(hi>=lo)
    {
      long mid=(lo+hi)/2;
      System.out.println(mid+" "+hi+" "+lo);
      
      long f=((mid)*(mid+1))/2;
      System.out.println(f+" "+t);
      if(f==t) return true;
      else if(f>t) hi=mid-1;
      else if(f<t) lo=mid+1;
    }
    return false;
  }
}
      
                           