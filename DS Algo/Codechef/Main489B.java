import java.util.Scanner;
import java.util.Arrays;
public class Main489B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int m=sc.nextInt();
    int[] b=new int[m];
    for(int i=0;i<m;i++)
      b[i]=sc.nextInt();
    Arrays.sort(a);
    Arrays.sort(b);
    int ans=0;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        if(Math.abs(a[i]-b[j])<=1)
        {
          b[j]=1000000;
          ans++;
          break;
        }
      }
    }
    System.out.println(ans);
  }
  
}
          
      
    