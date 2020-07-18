import java.util.Scanner;
public class Main200B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double sumP=0;
    for(int i=0;i<n;i++)
    {
      int x=sc.nextInt();
      sumP+=x;
    }
    System.out.println(sumP/n);
  }
}