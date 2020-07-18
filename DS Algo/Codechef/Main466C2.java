import java.util.Scanner;
public class Main466C2
{
  static long[] sum;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    long sum=0;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      sum+=a[i];
    }
    if(sum%3!=0)
    {
      System.out.println(0);
    }
    else     
    {
      sum=sum/3;
      int[] cnt=new int[n];
      int[] sums=new int[n];
      preprocess(cnt,sums,sum,a);
      long value=0;
      long ans=0;
      for(int i=0;i<n-2;i++)
      {
        value+=a[i];
        if(value==sum)
        {
          ans+=sums[i+2];
        }
      }
      System.out.println(ans);
    }
  }
  public static void preprocess(int[] cnt,int[] sums,long sum,int[] a)
  {
    
    long s=3*sum; 
    long current=a[0];
    int cnt_sum=0;
    for(int i=1;i<a.length;i++)
    {
      if((s-current)==sum)
        cnt[i]=1;
      current+=a[i];
      cnt_sum+=cnt[i];
    }
    int current2=0;
    for(int i=1;i<a.length;i++)
    {
      sums[i]=cnt_sum-current2;
      current2+=cnt[i];
    }
  }
}
      
      
      