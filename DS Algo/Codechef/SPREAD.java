import java.util.*;
public class SPREAD
{
  public static void main(String[] args)
  {
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int c=sc.nextInt();
    int[] a=new int[n];
    Arrays.fill(a,c);
    for(int i=0;i<m;i++)
    {
      String s=sc.next();
      if(s.equals("S"))
      {
        int u=sc.nextInt();
        int v=sc.nextInt();
        int k=sc.nextInt();
        for(int j=u;j<=v;j++)
        {
          a[j-1]+=k;
        }
      }
      else
      {
        int p=sc.nextInt();
        System.out.println(a[p-1]);
      }
    }
  }
}
        
    