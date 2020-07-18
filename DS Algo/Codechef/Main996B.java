import java.util.Scanner;
public class Main996B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    long[] p=new long[n];
    int min=0;
    long minValue=1000000000;
    for(int i=0;i<n;i++)
    {
      p[i]=solve(a[i],i,n);
      //System.out.println(n);
      if(p[i]<minValue)
      {
        min=i;
        minValue=p[i];
      }
      System.out.println(p[i]);
    }
    System.out.println(min+1);
  }
  public static long solve(int a,int id,int n)
  {
    int lo=0;
    int hi=1000000000;
    //int t=0
    long value=0;
    while(hi>lo)
    {
      int mid=(lo+hi)/2;
      //System.out.println(n);
      value=id+(long)(n)*mid;
      //System.out.println(value);
      
      if(value>a)
      {
        hi=mid;
      }
      else  lo=mid+1;
    }
    //System.out.println(hi);
    return value;
  }
}
    
      
                  
                  
                  
    