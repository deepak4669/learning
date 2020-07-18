import java.util.Scanner;
public class Main296A2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[1001];
    int max=0;
    for(int i=0;i<n;i++)
    {
      int v=sc.nextInt();
      a[v]++;
      if(a[v]>max) max=a[v];
    }
    //Arrays.sort(a);
   // System.out.println(Math.ceil((double)n/2));
    //System.out.println(max);
    if(max>Math.ceil((double)n/2))
      System.out.println("NO");
    else
      System.out.println("YES");
  }
}
    