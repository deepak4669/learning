import java.util.Scanner;
public class EvenOdds
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long k=sc.nextLong();
    if(n%2==0)
    {
      if(k>n/2)
      {
        k=k-n/2;
        System.out.println(2+(k-1)*2);
      }
      else if(k<n/2)
      {
        System.out.println(1+(k-1)*2);
      }
      else
      {
        System.out.println(1+(k-1)*2);
      }
    }
    else
    {
      if(k>(n+1)/2)
      {
        k=k-(n+1)/2;
        System.out.println(2+(k-1)*2);
      }
      else 
      {
        System.out.println(1+(k-1)*2);
      }
    }
  }
}