import java.util.Scanner;
public class Main347B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int fixed=0;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      //if(a[i]==i) fixed++;
    }
    int m=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]==i) fixed++;
      
      else if(a[a[i]]==i) m=2;
      else m=Math.max(m,1);
    }
    //System.out.println(fixed);
    //System.out.println(m);
    System.out.println(fixed+m);
  }
}
      
      
    