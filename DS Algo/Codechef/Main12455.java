import java.util.Scanner;
public class Main12455
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int p=sc.nextInt();
      int[] a=new int[p];
      for(int i=0;i<p;i++)
        a[i]=sc.nextInt();
      boolean flag=false;
      for(int i=0;i<(1<<p);i++)
      {
        int sum=0;
        for(int j=0;j<p;j++)
        {
          //System.out.println(sum);
          if((i&(1<<j))==(1<<j))
            sum+=a[j];
        }
        if(sum==n){
          flag=true;
          break;
        }
      }
      if(flag) System.out.println("YES");
      else System.out.println("NO");
    }
  }
}