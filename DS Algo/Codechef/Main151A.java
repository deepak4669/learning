import java.util.Scanner;
public class Main151A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int l=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    int p=sc.nextInt();
    int nl=sc.nextInt();
    int np=sc.nextInt();
    int x=(l*k)/nl;
    int y=c*d;
    int z=p/np;
    System.out.println(Math.min(x,Math.min(y,z))/n);
  }
}