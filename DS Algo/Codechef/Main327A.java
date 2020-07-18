import java.util.Scanner;
public class Main327A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int max=0;
    int x=0;
    int y=0;
    for(int i=0;i<n;i++)
    {
      for(int j=i;j<n;j++)
      {
        int ones=0;
        int zeros=0;
        for(int k=i;k<=j;k++)
        {
          if(a[k]==0)
            zeros++;
          else
            ones++;
        }
        if((zeros-ones)>max) {
          max=(zeros-ones);
          x=i;
          y=j;
        }
      }
    }
    for(int i=x;i<=y;i++)
    {
      if(a[i]==0) a[i]=1;
      else a[i]=0;
    }
    int ans=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]==1) ans++;
      //System.out.println(a[i]);
    }
    System.out.println(ans);
  }
}
        
          