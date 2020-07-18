import java.util.*;
public class Main1009A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] c=new int[n];
    for(int i=0;i<n;i++)
    {
      c[i]=sc.nextInt();
    }
    int[] a=new int[m];
    for(int i=0;i<m;i++)
    {
      a[i]=sc.nextInt();
    }
    int k=0;
    int cnt=0;
    for(int i=0;i<n;i++)
    {
      if(a[k]>=c[i])
      {
        cnt++;
        k++;
      }
      if(k==m) break;
    }
    System.out.println(cnt);
  }
}
    
    
                      