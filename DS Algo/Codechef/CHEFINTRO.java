import java.util.Scanner;
public class CHEFINTRO
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int r=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      int a=sc.nextInt();
      if(a<r)
        System.out.println("Bad boi");
      else
        System.out.println("Good boi");
    }
  }
}
      