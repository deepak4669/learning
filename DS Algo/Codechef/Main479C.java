import java.util.Scanner;
import java.util.Arrays;
public class Main479C
{
  public static class exam implements Comparable<exam>
  {
    int a,b;
    public exam(int a, int b)
    {
      this.a=a;
      this.b=b;
    }
    public int compareTo(exam that)
    {
      if(this.a>that.a) return +1;
      else if(this.a<that.a) return -1;
      else if(this.b>that.b) return +1;
      else if(this.b<that.b) return -1;
      else return 0;
    }
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    exam[] a=new exam[n];
    for(int i=0;i<n;i++)
    {
      int p=sc.nextInt();
      int q=sc.nextInt();
      a[i]=new exam(p,q);
    }
    Arrays.sort(a);
    int ans=a[0].b;
    for(int i=1;i<n;i++)
    {
      if(a[i].b>=ans) ans=a[i].b;
      else ans=a[i].a;
    }
    System.out.println(ans);
  }
}
      
      
    