import java.util.Scanner;
public class Main459B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int min=1000000000;
    int max=0;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      if(min>a[i]) min=a[i];
      if(max<a[i]) max=a[i];
    }
    int count_max=0;
    int count_min=0;
    
    for(int i=0;i<n;i++)
    {
      if(min==a[i]) count_min++;
      if(max==a[i]) count_max++;
    }
    long ans;
    if(count_min==n&&count_max==n)
      ans=((long)n*(n-1))/2;
    else ans=(long)count_min*count_max;
    System.out.println((max-min)+" "+ans);
  }
}
    
  