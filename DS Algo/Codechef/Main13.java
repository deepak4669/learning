import java.util.Scanner;
public class Main13
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int[] res=new int[1000];
    int n=1;
    int i=0;
    while(n!=0)
    {
      n=sc.nextInt();
      res[i++]=nosquares(n);
    }
    for(int j=0;j<i;j++)
    {
      if(res[j]==0) System.out.println();
      else
        System.out.println(res[j]);
    }
  }
  public static int nosquares(int n)
  {
    int res=0;
    for(int i=1;i<=n;i++)
    {
      res+=i*i;
    }
    
    return res;
  }
}
     