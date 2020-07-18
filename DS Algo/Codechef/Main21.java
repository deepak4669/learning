import java.util.Scanner;
public class Main21
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    String[] res=new String[t];
    for(int i=0;i<t;i++)
    {
      int n=sc.nextInt();
      int c=sc.nextInt();
      int[] a=new int[n];
      for(int j=0;j<n;j++)
        a[j]=sc.nextInt();
      res[i]=ans(a,c);
    }
    for(int i=0;i<t;i++)
      System.out.println(res[i]);
  }
  public static String ans(int[] a,int c)
  {
    int d=c;
    for(int i=0;i<a.length;i++)
    {
      d-=a[i];
    }
    if(d<0) return "No";
    else return "Yes";
  }
}