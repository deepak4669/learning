import java.util.Scanner;
public class Main96A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int i;
    int countA=0;
    int countB=0;
    for(i=0;i<s.length();i++)
    {
      char ch=s.charAt(i);
      if(ch=='0')
      {
        countA++;
        countB=0;
      }
      else if(ch=='1')
      {
        countB++;
        countA=0;
      }
      if(countA>=7||countB>=7)
      {
        System.out.println("YES");
        break;
      }
    }
    if(i==s.length()) System.out.println("NO");
  }
}
      