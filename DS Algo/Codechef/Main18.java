import java.util.Scanner;
public class Main18
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    System.out.println(res(t));
  }
  public static int res(int a)
  {
    int res=0;
    for(int i=1;i<=a;i++)
    {
      //if(a%i==0)
      //{
        for(int j=i;j<=a;j++)
        {
          if(i*j>a) break;
          //System.out.println(j);
          res++;
        }
      //}
      //else continue;
    }
    return res;
  }
}
    