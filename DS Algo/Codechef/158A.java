import java.util.Scanner;
public class 158A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int ans=0;
    int kth=a[k-1];
    for(int i=0;i<n;i++)
    {
      if(a[i]>0&&a[i]>kth)
        ans++;
    }
    System.out.println(ans);
  }
}
      