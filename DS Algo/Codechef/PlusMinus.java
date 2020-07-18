import java.util.Scanner;
public class PlusMinus
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double a=0,b=0,c=0;
    for(int i=0;i<n;i++)
    {
      int number=sc.nextInt();
      if(number>0) a++;
      else if(number <0) b++;
      else c++;
    }
    System.out.println(a/n);
    System.out.println(b/n);
    System.out.println(c/n);
  }
}
        
    