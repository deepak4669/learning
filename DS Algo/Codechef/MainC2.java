import java.util.*;
public class MainC2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    double ans=0;
    for(int i=0;i<m;i++)
    {
      int x=sc.nextInt();
      int d=sc.nextInt();
      ans+=x;
      ans+=d*((n-1)*n/2);
    }
    System.out.println(ans);
  }
}
    