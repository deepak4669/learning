import java.util.Scanner;
public class Main352A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int zero=0;
    int five=0;
    
    for(int i=0;i<n;i++)
    {
      int val=sc.nextInt();
      if(val==5) five++;
      else zero++;
    }
    if(zero==0) System.out.println(-1);
    else
    {
      if(five<9) System.out.println(0);
      else
      {
        int nofives=five%9;
        nofives=five-nofives;
        for(int i=0;i<nofives;i++)
        {
          System.out.print(5);
        }
        for(int i=0;i<zero;i++)
        {
          System.out.print(0);
        }
      }
    }
  }
}
      