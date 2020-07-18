import java.util.*;

public class UVa408
{
  static int gcd(int a,int b)
  {
    if(a==0) return b;
    else return gcd(b%a,a);
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNextInt())
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      boolean flag=true;
      if(gcd(a,b)!=1)
        flag=false;
      if(flag)
        System.out.printf("%10s  %8s  %-1s %s\n",a,b,"","Good Choice");
      else
        System.out.printf("%10s  %8s  %-1s %s\n",a,b,"","Bad Choice");
      String s=sc.nextLine();
      System.out.println();
    }
  }
}
        
    