import java.util.Scanner;
public class SILVER
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    while(true)
    {
      int n=sc.nextInt();
      if(n==0) break;
      System.out.println((int)(Math.log((double)n)/Math.log(2)));
    }
  }
}