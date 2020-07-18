import java.util.Scanner;
import java.util.HashMap;
public class FARIDA
{
  static HashMap<Integer,Long> map=new HashMap<Integer,Long>();
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
      map.clear();
      int n=sc.nextInt();
      int[] a=new int[n];
      for(int j=0;j<n;j++)
        a[j]=sc.nextInt();
      long ans=solve(a,n);
      System.out.println("Case "+(i+1)+": " +ans);
      
    }
  }
  public static long solve(int[] a,int n)
  {
    if(map.containsKey(n)) return map.get(n);
    if(n==0) return 0;
    if(n==1) return a[0];
    long p=solve(a,n-1);
    long q=solve(a,n-2)+a[n-1];
    long max;
    //System.out.println(p);
    //System.out.println(q);
    if(p>q)
      max=p;
    else
      max=q;
    //System.out.println(max);
    map.put(n,max);
    return max;
  }
}
    
              
       