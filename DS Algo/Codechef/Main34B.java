import java.util.Scanner;
import java.util.Arrays;
public class Main34B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    //int neg=0;
    //int pos=0;
    //int zero=0;
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      //if(a[i]>0) pos++;
      //else if(a[i]==0) zero++;
      //else neg++;
    }
    Arrays.sort(a);
    int ans=0;
    for(int i=0;i<m;i++)
    {
      if(a[i]>0)
        break;
      ans+=a[i];
    }
    System.out.println(Math.abs(ans));
  }
}
    