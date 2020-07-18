import java.util.Scanner;
public class EULER9
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int[] a=new int[n+1];
      for(int i=1;i<=n;i++)
        a[i]=i;
      int ans=-1;
      for(int i=1;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          int c=n-i-j;
          if(i*i+j*j==c*c)
          {
            int value=i*j*c;
            if(value>ans) ans=value;
          }
        }
      }
      System.out.println(ans);
    }
  }
}
        
      
     