import java.util.Scanner;
public class Main361A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(i==j)
          System.out.print(k+" ");
        else
          System.out.print(0+" ");
      }
      System.out.println();
    }
  }
}