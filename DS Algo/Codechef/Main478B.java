import java.util.Scanner;
public class Main478B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long m=sc.nextLong();
    long max=((n-m+1)*(n-m))/2;
    Long n1=n/m;
    Long n2=n%m;
    long min=((n2)*(n1+1)*(n1))/2+(m-n2)*((n1)*(n1-1))/2;
    System.out.println(min+" "+max);
  }
}