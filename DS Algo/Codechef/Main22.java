import java.util.Scanner;
public class Main22
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    String[] res=new String[t];
    
    for(int i=0;i<t;i++)
    {
      System.out.println();
      int b=sc.nextInt();
      int[] c=new int[b];
      for(int j=0;j<b;j++)
        c[j]=sc.nextInt();
      res[i]=ans(c);
    }
    for(int i=0;i<t;i++)
    {
      System.out.println(res[i]);
    }
  }
  public static String ans(int[] c)
  {
    int candies=0;
    for(int i=0;i<c.length;i++)
      candies+=c[i];
    
    if(candies%(c.length)==0) return "Yes";
    else return "NO";
  }
}