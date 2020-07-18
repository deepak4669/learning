import java.util.Scanner;
public class EULER40
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s="";
    StringBuilder s2=new StringBuilder();
    for(int i=1;i<=1000000;i++)
      s2.append(i);
    int ans=1;
    for(int i=1;i<=1000000;i*=10)
    {
      ans*=Integer.parseInt(s2.substring(i-1,i));
    }
    System.out.println(ans);
  }
}