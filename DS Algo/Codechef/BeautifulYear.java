import java.util.Scanner;
public class BeautifulYear
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=n;
    for(i=n+1;!beautiful(i);i++);
    System.out.println(i);
  }
  public static boolean beautiful(int n)
  {
    int a=n;
    int[] digits=new int[100];
    int k=0;
    while(a>0)
    {
      digits[k++]=a%10;
      a/=10;
    }
    for(int i=1;i<k;i++)
    {
      for(int j=0;j<=i-1;j++)
        if(digits[j]==digits[i]) return false;
    }
    return true;
  }
}
      