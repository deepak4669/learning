import java.util.Scanner;
public class Main104A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //assert n>10;
    int m=n-10;
    if(m==10)
      System.out.println(15);
    else if(m>=1&&m<=9||m==11)
      System.out.println(4);
    else
      System.out.println(0);
  }
}