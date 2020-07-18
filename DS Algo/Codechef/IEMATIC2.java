import java.util.Scanner;
public class IEMATIC2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long i=(long)99999999999;
    for(;;i++)
    {
      if(sum(i)==100)
      {
        break;
      }
    }
    System.out.println(i);
  }
  public static int sum(long n)
  {
    int c=0;
    while(n>0)
    {
      c+=(n%10);
      n/=10;
    }
    return c;
  }
  
  
}
  